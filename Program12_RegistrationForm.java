import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Program12_RegistrationForm extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5;
    JButton submit;

    Program12_RegistrationForm() {

        setTitle("Registration Form");
        setSize(400, 400);
        setLayout(null);

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(30, 30, 100, 25);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(150, 30, 150, 25);
        add(t1);

        JLabel l2 = new JLabel("Email:");
        l2.setBounds(30, 70, 100, 25);
        add(l2);

        t2 = new JTextField();
        t2.setBounds(150, 70, 150, 25);
        add(t2);

        JLabel l3 = new JLabel("Phone:");
        l3.setBounds(30, 110, 100, 25);
        add(l3);

        t3 = new JTextField();
        t3.setBounds(150, 110, 150, 25);
        add(t3);

        JLabel l4 = new JLabel("City:");
        l4.setBounds(30, 150, 100, 25);
        add(l4);

        t4 = new JTextField();
        t4.setBounds(150, 150, 150, 25);
        add(t4);

        JLabel l5 = new JLabel("Age:");
        l5.setBounds(30, 190, 100, 25);
        add(l5);

        t5 = new JTextField();
        t5.setBounds(150, 190, 150, 25);
        add(t5);

        submit = new JButton("Submit");
        submit.setBounds(120, 240, 100, 30);
        add(submit);

        submit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String name = t1.getText();
        String email = t2.getText();
        String phone = t3.getText();
        String city = t4.getText();
        String age = t5.getText();

        try {
            // JDBC code (will work if MySQL is set)
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test", "root", "password"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES (?, ?, ?, ?, ?)"
            );

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, city);
            ps.setString(5, age);

            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Saved!");

            con.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database not connected (demo mode)");
        }
    }

    public static void main(String[] args) {
        new Program12_RegistrationForm();
    }
}