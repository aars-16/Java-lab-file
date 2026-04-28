import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DrawPanel extends JPanel {
    String shape = "";

    void setShape(String s) {
        shape = s;
        repaint();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (shape.equals("circle")) {
            g.drawOval(100, 100, 100, 100);
        } 
        else if (shape.equals("oval")) {
            g.drawOval(80, 100, 150, 80);
        } 
        else if (shape.equals("rectangle")) {
            g.drawRect(80, 100, 150, 80);
        } 
        else if (shape.equals("line")) {
            g.drawLine(50, 50, 200, 200);
        }
    }
}

public class Program15_Shapes extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4;
    DrawPanel panel;

    Program15_Shapes() {

        setTitle("Shapes");
        setSize(400, 400);
        setLayout(new FlowLayout());

        b1 = new JButton("Circle");
        b2 = new JButton("Oval");
        b3 = new JButton("Rectangle");
        b4 = new JButton("Line");

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        panel = new DrawPanel();
        panel.setPreferredSize(new Dimension(350, 300));
        add(panel);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1)
            panel.setShape("circle");
        else if (e.getSource() == b2)
            panel.setShape("oval");
        else if (e.getSource() == b3)
            panel.setShape("rectangle");
        else if (e.getSource() == b4)
            panel.setShape("line");
    }

    public static void main(String[] args) {
        new Program15_Shapes();
    }
}