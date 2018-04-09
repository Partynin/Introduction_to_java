package Chapter_1_and_2;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kos on 24.05.2017.
 */
public class Window extends JFrame{
    Window(String s){
        super(s);
        setBackground(Color.BLUE);
        setSize(400, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   public void paint(Graphics g){
       g.setFont(new Font("Serif", Font.ITALIC| Font.BOLD, 30));
       g.drawString("Hello, XXI Century World!", 20, 100);
    }
    public static void main(String[] args){
        new Window(" Моя программа");
    }
}

