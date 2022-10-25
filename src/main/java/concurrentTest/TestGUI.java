package concurrentTest;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TestGUI extends JFrame implements KeyListener {
    public static  void  main(String[]args){
        new TestGUI();
    }
    TestGUI(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.setVisible(true);
        this.addKeyListener(this);
    }
    @Override
    public void keyTyped(KeyEvent e) {
    System.out.println("<<<<<<<<<");
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
