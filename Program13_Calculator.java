import java.awt.event.*;
import javax.swing.*;

public class Program13_Calculator extends JFrame implements ActionListener {

    JTextField t1, t2, result;
    JButton add, sub, mul, div;

    Program13_Calculator() {

        setTitle("Calculator");
        setSize(350, 300);
        setLayout(null);

        JLabel l1 = new JLabel("Number 1:");
        l1.setBounds(30, 30, 100, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(130, 30, 120, 25);
        add(t1);

        JLabel l2 = new JLabel("Number 2:");
        l2.setBounds(30, 70, 100, 25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(130, 70, 120, 25);
        add(t2);

        add = new JButton("+");
        add.setBounds(30, 110, 50, 30);
        sub = new JButton("-");
        sub.setBounds(90, 110, 50, 30);
        mul = new JButton("*");
        mul.setBounds(150, 110, 50, 30);
        div = new JButton("/");
        div.setBounds(210, 110, 50, 30);

        add(add);
        add(sub);
        add(mul);
        add(div);

        result = new JTextField();
        result.setBounds(130, 160, 120, 25);
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int res = 0;

        if (e.getSource() == add)
            res = a + b;
        else if (e.getSource() == sub)
            res = a - b;
        else if (e.getSource() == mul)
            res = a * b;
        else if (e.getSource() == div)
            res = a / b;

        result.setText(String.valueOf(res));
    }

    public static void main(String[] args) {
        new Program13_Calculator();
    }
}