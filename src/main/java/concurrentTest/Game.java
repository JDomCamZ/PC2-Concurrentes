package concurrentTest;

import java.lang.management.PlatformLoggingMXBean;
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
            Terrain t=new Terrain(80,27);
            for(Player player:Players){
                t.Print(player.position[1],player.position[0],player.playerChar);
            }
            Player p=new Player(name ,t);
            p.RandomSpawnPosition();
            p.terrainPlayer.Print(p.position[1],p.position[0],p.playerChar);//
            Players.add(p);
        }

        do{
            for(Player pl:Players){
                Terrain newTerrain=new Terrain(80,27);
                newTerrain.startMap();
                for(Player Other:Players){
                    newTerrain.Print(Other.position[1],Other.position[0],Other.playerChar);
                }
                pl.terrainPlayer=newTerrain;
            }
            for(Player pl:Players){
                System.out.println("Mueve jugador "+pl.playerChar);
                pl.PositionInMap();
            }

            for(Player pl:Players){
                Terrain newTerrain=new Terrain(80,27);
                newTerrain.startMap();
                for(Player Other:Players){
                    newTerrain.Print(Other.position[1],Other.position[0],Other.playerChar);
                }
                pl.terrainPlayer=newTerrain;
            }
           //terrain.startMap();
           /*for(Player pl:Players){
               System.out.println("Mueve jugador "+pl.playerChar);
               System.out.println(pl.getClass().getTypeName());
               terrain.Delete(pl);
               pl.Move(terrain.currentTerrain);
               terrain.Print(pl);
               // terrain.UpdateCurrentTerrain(pl,27 ,80);
           }*/
           for(Player pl:Players){
             pl.PlayerCamera();
             pl.PrintCamera();
           }
        }while(true);
    }
}
