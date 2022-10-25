import java.util.ArrayList;
import java.util.Scanner;

public class Servidor50 {
    private BattleChopperGameStatus gameStatus;
    TCPServer50 mTcpServer;
    Scanner sc;
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
        String salir = "n";
        sc = new Scanner(System.in);
        System.out.println("Servidor bandera 01");
        while( !salir.equals("s")){
            salir = sc.nextLine();
            ServidorEnvia(salir);
        }
        System.out.println("Servidor bandera 02");

    }
    void ServidorRecibe(String llego){
        System.out.println("Client > " + llego);
        if(llego != null && !llego.equals("")) {
            String[] splitted = llego.split(" ");
            String command = splitted[0];
            int idx;
            switch (command) {
                case "start":   //Iniciar el juego en todos los clientes
                    String newShipPositionsMessage = "players " + mTcpServer.nrcli;
                    for(Ship ship : gameStatus.ships) {
                        newShipPositionsMessage += (" " + ship.xPos);
                    }
                    mTcpServer.sendMessageTCPServer(newShipPositionsMessage);
                    sendStartGame();
                    break;
                case "key": //Recibe el input de un usuario
                    idx = Integer.parseInt(splitted[1]);
                    int keyCode = Integer.parseInt(splitted[2]);
                    switch (keyCode) {
                        case 65:
                        case 68:
                            gameStatus.ships.get(idx).moveShip(keyCode);
                            sendShipPosition(idx);
                            break;
                        case 75:
                            sendShooterPosition(idx);
                            break;
                        case 81:
                            mTcpServer.sendclis[idx].stopClient();
                            break;
                    }
                    break;
                case "died":
                    idx = Integer.parseInt(splitted[1]);
                    sendStatus(idx);
                    break;
            }
        }
    }
    void ServidorEnvia(String envia){
        if (mTcpServer != null) {
            mTcpServer.sendMessageTCPServer(envia);
        }
    }

    public void sendStartGame() {
        mTcpServer.sendMessageTCPServer("start");
    }

    //Send ship[idx] position: pos [idx] [xPos]
    public void sendShipPosition(int idx) {
        String message = "pos " + idx + " " + gameStatus.ships.get(idx).xPos;
        mTcpServer.sendMessageTCPServer(message);
    }

    public void sendShooterPosition(int idx) {
        mTcpServer.sendMessageTCPServer("shoot " + idx);
    }

    public void sendStatus(int idx) {
        String message = "status " + idx + " " + 0;
        mTcpServer.sendMessageTCPServer(message);
    }
}
class BattleChopperGameStatus {
    public int height = 11, width = 39;
    public ArrayList<Ship> ships = new ArrayList<>();
    //public ArrayList<Enemy> enemies = new ArrayList<>();

    //Add a new Ship and reset all the ship positions
    public void addShip() {
        int gap = (width - (ships.size() + 1)) / (ships.size() + 2);
        int newPos = gap;
        for(int i = 0; i < ships.size(); i++) {
            ships.get(i).moveShipTo(newPos);
            newPos += (gap + 1);
        }
        Ship newShip = new Ship(newPos, 1, this, ships);
        ships.add(newShip);
    }

}

class Ship {
    public int xPos;
    public int status;
    private BattleChopperGameStatus gameStatus;
    private ArrayList<Ship> ships;

    //Creates a ship
    public Ship(int xPos, int status, BattleChopperGameStatus gameStatus, ArrayList<Ship>ships) {
        this.xPos = xPos;
        this.status = status;
        this.gameStatus = gameStatus;
        this.ships = ships;
    }

    //Moves a ship to a fixed positions
    public void moveShipTo(int xPos) {
        this.xPos = xPos;
    }

    //Moves a ship according to the keyCode
    public void moveShip(int keyCode) {
        switch(keyCode){
            // Izquierda
            case 65:
                if(xPos > 0 && checkNewPos(xPos - 1))  xPos--;
                break;
            // Derecha
            case 68:
                if(xPos < gameStatus.width - 1 && checkNewPos(xPos + 1)) xPos++;
                break;
        }
    }

    public boolean checkNewPos(int newPos) {
        for(Ship ship : ships) {
            if(ship != this && ship.xPos == newPos) return false;
        }
        return true;
    }

}
