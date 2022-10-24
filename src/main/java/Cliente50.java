import java.util.Scanner;

class Cliente50{
    String SERVERIP;
    int port;
    TCPClient50 mTcpClient;
    Scanner sc;
    public Cliente50(String ip, int port) {
        this.SERVERIP = ip;
        this.port = port;
    }

    public static void main(String[] args)  {
        String miip = "192.168.0.10";
        int myp = 4444;
        Cliente50 objcli = new Cliente50(miip, myp);
        objcli.iniciar();
    }

    Cliente50(String IP, String puerto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    void iniciar(){
       new Thread(
            new Runnable() {

                @Override
                public void run() {
                    mTcpClient = new TCPClient50(SERVERIP, port,
                        new TCPClient50.OnMessageReceived(){
                            @Override
                            public void messageReceived(String message){
                                ClienteRecibe(message);
                            }
                        }
                    );
                    mTcpClient.run();                   
                }
            }
        ).start();
        //---------------------------
       
        String salir = "n";
        sc = new Scanner(System.in);
        System.out.println("Cliente bandera 01");
        while( !salir.equals("s")){
            salir = sc.nextLine();
            ClienteEnvia(salir);
        }
        System.out.println("Cliente bandera 02");
    
    }
    void ClienteRecibe(String llego){
        System.out.println("CLINTE50 El mensaje::" + llego);

    }
    void ClienteEnvia(String envia){
        if (mTcpClient != null) {
            mTcpClient.sendMessage(envia);
        }
    }

}
