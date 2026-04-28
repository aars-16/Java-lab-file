import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Program16_Paint extends JFrame {

    int x, y;

    Program16_Paint() {

        setTitle("Simple Paint");
        setSize(500, 500);

        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE); // default color
        g.fillOval(x, y, 10, 10); // draw small circle
    }

    public static void main(String[] args) {
        new Program16_Paint();
    }
}