
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author Miguel Huamani <miguel.huamani.r@uni.pe>
 */
public class Player {
    char player;
    int points,cameraWhid,cameraHeigth,whid,heigth;
    int []position={13,30};
    int []centerCamera={13,30};
    int[]terrainSize={27,80};
    Scanner input=new Scanner(System.in);
    
    String move;
    public Player(char p,Terrain terrain){
       player=p;
       cameraWhid=16;
       cameraHeigth=9;
       whid=terrain.whid;
       heigth=terrain.heigth;
       do{
          position[1]=30+(int)(Math.random()*20);
       }while(terrain.currentTerrain[position[0]][position[1]]!=' ');
       
       CameraControler();
    }
    
    public void MoveComands(char [][] terrain){
     move =(input.next());
    if(!move.equals("")){
          if(move.equals("d")&&terrain[position[0]][position[1]+1]!='#'&&position[1]+1<whid-1)position[1]+=1;
          if(move.equals("a")&&terrain[position[0]][position[1]-1]!='#'&&position[1]-1>0)position[1]-=1;
          if(move.equals("s")&&terrain[position[0]+1][position[1]]!='#'&&position[0]+1<heigth-1)position[0]+=1;
          if(move.equals("w")&&terrain[position[0]-1][position[1]]!='#'&&position[0]-1>0)position[0]-=1;
        }
         
    }
    public void CameraControler(){
        if(position[1]>cameraWhid-1 &&position[1]<terrainSize[1]-cameraWhid){
          centerCamera[1]=position[1];
        }
        if(position[0]>cameraHeigth-1 &&position[0]<terrainSize[0]-cameraHeigth){
          centerCamera[0]=position[0];
        } 
    }

    public void PrintPlayerCamera(char [][]current){
          for(int i=position[0]-cameraHeigth-1;i<=position[0]+cameraHeigth+1;i++){
           for(int j=position[1]-cameraWhid-1;j<=position[1]+cameraWhid+1;j++){
                  if(i==position[0]-cameraHeigth-1||i==position[0]+cameraHeigth+1||j==position[1]-cameraWhid-1||j==position[1]+cameraWhid+1){
                      System.out.print('$');
                  }else{
                      System.out.print(current[i][j]);
                  }
                   
               }
           System.out.println("");
           }
    }

}
