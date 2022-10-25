/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient50 {

    private char[][] servermsj;
    public  String SERVERIP;
    public static int SERVERPORT;
    private OnMessageReceived mMessageListener = null;
    private boolean mRun = false;

    PrintWriter out;
    InputStream in;

    public TCPClient50(String ip, int port, OnMessageReceived listener) {
        SERVERIP = ip;
        SERVERPORT = port;
        mMessageListener = listener;
    }
    public void sendMessage(String message){
        if (out != null && !out.checkError()) {
            out.println(message);
            out.flush();
        }
    }
    public void stopClient(){
        mRun = false;
    }
    public void run() {
        mRun = true;
        try {
            InetAddress serverAddr = InetAddress.getByName(SERVERIP);
            System.out.println("TCP Client"+ "C: Conectando...");
            Socket socket = new Socket(serverAddr, SERVERPORT);
            try {
                out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
                System.out.println("TCP Client"+ "C: Sent.");
                System.out.println("TCP Client"+ "C: Done.");
                in = socket.getInputStream();
                while (mRun) {
                    servermsj = readBoard(in);
                    if (servermsj != null && mMessageListener != null) {
                        mMessageListener.messageReceived(servermsj);
                    }
                    servermsj = null;
                }
            } catch (Exception e) {
                System.out.println("TCP"+ "S: Error"+e);

            } finally {
                socket.close();
            }
        } catch (Exception e) {
            System.out.println("TCP"+ "C: Error"+ e);
        }
    }
    public interface OnMessageReceived {
        public void messageReceived(char[][] message);
    }
    public static char[][] readBoard(InputStream in) throws IOException {
        char[][] board = new char[27][80];
        for(int i=0;i<22;i++) {
            for(int j=0; j<80;j++) {
                board[i][j] = (char) in.read();
            }
        }
        return board;
    }
}