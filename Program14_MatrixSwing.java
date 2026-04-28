import java.awt.event.*;
import javax.swing.*;

public class Program14_MatrixSwing extends JFrame implements ActionListener {

    JTextField a11, a12, a21, a22;
    JTextField b11, b12, b21, b22;
    JTextField r11, r12, r21, r22;
    JButton addBtn;

    Program14_MatrixSwing() {

        setTitle("Matrix Addition");
        setSize(400, 400);
        setLayout(null);

        // Matrix A
        a11 = new JTextField(); a11.setBounds(50, 50, 40, 30); add(a11);
        a12 = new JTextField(); a12.setBounds(100, 50, 40, 30); add(a12);
        a21 = new JTextField(); a21.setBounds(50, 90, 40, 30); add(a21);
        a22 = new JTextField(); a22.setBounds(100, 90, 40, 30); add(a22);

        // Matrix B
        b11 = new JTextField(); b11.setBounds(200, 50, 40, 30); add(b11);
        b12 = new JTextField(); b12.setBounds(250, 50, 40, 30); add(b12);
        b21 = new JTextField(); b21.setBounds(200, 90, 40, 30); add(b21);
        b22 = new JTextField(); b22.setBounds(250, 90, 40, 30); add(b22);

        // Result
        r11 = new JTextField(); r11.setBounds(50, 200, 40, 30); add(r11);
        r12 = new JTextField(); r12.setBounds(100, 200, 40, 30); add(r12);
        r21 = new JTextField(); r21.setBounds(50, 240, 40, 30); add(r21);
        r22 = new JTextField(); r22.setBounds(100, 240, 40, 30); add(r22);

        addBtn = new JButton("Add");
        addBtn.setBounds(150, 150, 80, 30);
        add(addBtn);

        addBtn.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int A11 = Integer.parseInt(a11.getText());
        int A12 = Integer.parseInt(a12.getText());
        int A21 = Integer.parseInt(a21.getText());
        int A22 = Integer.parseInt(a22.getText());

        int B11 = Integer.parseInt(b11.getText());
        int B12 = Integer.parseInt(b12.getText());
        int B21 = Integer.parseInt(b21.getText());
        int B22 = Integer.parseInt(b22.getText());

        r11.setText(String.valueOf(A11 + B11));
        r12.setText(String.valueOf(A12 + B12));
        r21.setText(String.valueOf(A21 + B21));
        r22.setText(String.valueOf(A22 + B22));
    }

    public static void main(String[] args) {
        new Program14_MatrixSwing();
    }
}