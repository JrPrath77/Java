Experiment 6

1.	Program to create a login form:

Program:
import javax.swing.*;

public class Exp7_1 {
    public Exp7_1() {
        JFrame jframe = new JFrame("Login Form");
        jframe.setLayout(null);
        jframe.setSize(400, 200);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        jframe.setVisible(true);

        // Username label
        JLabel jlabel = new JLabel("Username:");
        jlabel.setBounds(50, 30, 80, 25); // x, y, width, height
        jframe.add(jlabel);

        // Password label
        JLabel jlabel2 = new JLabel("Password:");
        jlabel2.setBounds(50, 70, 80, 25); // x, y, width, height
        jframe.add(jlabel2);

        // Username text field
        JTextField t1 = new JTextField(); // Changed from JTextArea to JTextField for single-line input
        t1.setBounds(150, 30, 150, 25); // x, y, width, height
        jframe.add(t1);

        // Password text field
        JPasswordField t2 = new JPasswordField();
        t2.setBounds(150, 70, 150, 25); // x, y, width, height
        jframe.add(t2);

        // Login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(150, 110, 80, 25); // x, y, width, height
        jframe.add(loginButton);
    }

    public static void main(String[] args) {
        new Exp7_1();
    }
}

