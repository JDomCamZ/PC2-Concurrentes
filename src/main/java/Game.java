import java.util.ArrayList;
/**
 *
 * @author Miguel Huamani <miguel.huamani.r@uni.pe>
 */
public class Game {
    static int n=3;
     
    
    public static void main(String []args){
        Terrain terrain =new Terrain(80,27);
        terrain.startMap();
        
        ArrayList <Player>Players =new ArrayList();

        for(int i=0;i<n;i++){
            char name=(char)('a'+i);
            Players.add(new Player(name ,terrain));
            terrain.Print(Players.get(i));
        }
        do{
           //terrain.startMap();
           for(Player pl:Players){
               System.out.println("Mueve jugador "+pl.playerChar);
               System.out.println(pl.getClass().getTypeName());
               terrain.Delete(pl);
               pl.Move(terrain.currentTerrain);
               terrain.Print(pl);

               // terrain.UpdateCurrentTerrain(pl,27 ,80);
           }
           for(Player pl:Players){
             pl.PlayerCamera(terrain.currentTerrain);
             pl.PrintCamera();
           }
        }while(true);
    }
}
