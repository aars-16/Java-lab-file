import java.awt.event.*;
import javax.swing.*;

public class Program11_AdditionSwing extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton btn;

    Program11_AdditionSwing() {

        setTitle("Addition Program");
        setSize(300, 200);
        setLayout(null);

        JLabel l1 = new JLabel("Number 1:");
        l1.setBounds(20, 20, 80, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(100, 20, 120, 25);
        add(t1);

        JLabel l2 = new JLabel("Number 2:");
        l2.setBounds(20, 60, 80, 25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(100, 60, 120, 25);
        add(t2);

        btn = new JButton("Add");
        btn.setBounds(90, 100, 80, 30);
        add(btn);

        t3 = new JTextField();
        t3.setBounds(100, 140, 120, 25);
        add(t3);

        btn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a + b;
        t3.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new Program11_AdditionSwing();
    }
}