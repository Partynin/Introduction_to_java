package Chapter_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

/**
 * Created by Kos on 28.06.2017.
 */
public class GUI extends JFrame{
    private JPanel panel;
    private JLabel statusBar;
    Random random = new Random(10);

    public GUI(){
        super("Бериги глаза!!!");
        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension scrinSize = kit.getScreenSize();
        int screenHeight = scrinSize.height;
        int screenWidth = scrinSize.width;
        int frameWidth = 800;
        int frameHeight = 600;
        setSize(frameWidth, frameHeight);
        setLocation((screenWidth / 2) - frameWidth / 2,(screenHeight / 2) - frameHeight / 2);
        panel.setSize(800,600);
        add(panel, BorderLayout.CENTER);

        statusBar = new JLabel("Нуу.. сейчас начнётся!!!");
        add(statusBar, BorderLayout.SOUTH);

        Handlers handlers = new Handlers();
        panel.addMouseListener(handlers);
        panel.addMouseMotionListener(handlers);
    }

    private class Handlers implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            statusBar.setText(String.format("Координаты клика x = %d y = %d.", e.getX(), e.getY()));
        }

        @Override
        public void mousePressed(MouseEvent e) {
            statusBar.setText("Кнопка мыши зажата.");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            statusBar.setText("Кнопка мыши освобожеНА!!!");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            statusBar.setText("Курсор в окне.");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            statusBar.setText("Курсор вышел из окна)))");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            statusBar.setText("Мышь тащится!.");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            statusBar.setText(String.format("Мышь тут %d %d и она генерирует число %d" , e.getX(), e.getY(), random.nextInt()));
            if ((int)(Math.random() * 10) == 1)
                panel.setBackground(Color.cyan);
            if ((int)(Math.random() * 10) == 2)
                panel.setBackground(Color.green);
            if ((int)(Math.random() * 10) == 3)
                panel.setBackground(Color.darkGray);
            if ((int)(Math.random() * 10) == 4)
                panel.setBackground(Color.blue);
            if ((int)(Math.random() * 10) == 5)
                panel.setBackground(Color.orange);
            if ((int)(Math.random() * 10) == 6)
                panel.setBackground(Color.yellow);
            if ((int)(Math.random() * 10) == 7)
                panel.setBackground(Color.lightGray);
            if ((int)(Math.random() * 10) == 8)
                panel.setBackground(Color.red);
            if ((int)(Math.random() * 10) == 9)
                statusBar.setBackground(Color.pink);

        }
    }
}
