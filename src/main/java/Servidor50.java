import java.util.Scanner;

public class Servidor50 {
   TCPServer50 mTcpServer;
   Scanner sc;
   char[][] asd;
   public static void main(String[] args) {
       Servidor50 objser = new Servidor50();
       objser.iniciar();
   }
   void iniciar(){
       new Thread(
            new Runnable() {

                @Override
                public void run() {
                      mTcpServer = new TCPServer50(
                        new TCPServer50.OnMessageReceived(){
                            @Override
                            public void messageReceived(String message){
                                ServidorRecibe(message);
                            }
                        }
                    );
                    mTcpServer.run();                   
                }
            }
        ).start();
        //-----------------
        asd = new char[][]{{'1', '1'},
                            {'1', '1'}};
        sc = new Scanner(System.in);
        System.out.println("Servidor bandera 01");
        while( !asd.equals("s")){
            /*asd = sc.nextLine();*/
            ServidorEnvia(asd);
       }
       System.out.println("Servidor bandera 02"); 
   
   }
   void ServidorRecibe(String llego){
       System.out.println("SERVIDOR40 El mensaje:" + llego);
   }
   void ServidorEnvia(char[][] partmap){
        if (mTcpServer != null) {
            mTcpServer.sendMessageTCPServer(partmap);
        }
   }
}
