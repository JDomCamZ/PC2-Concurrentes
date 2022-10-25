import java.lang.Math;
import java.util.Scanner;
public class Enemy implements ThreadEntity{
    int direction;
    int [] position={13,0};
    public Enemy(){
        direction=2*(int)(Math.random()*2)-1;
        position[0]=9+(int)(Math.random()*9);
        position[1]=(79-79*(int)Math.signum(direction+1));
    }
    @Override
    public void Move(char[][] terrain) {

    }
}
