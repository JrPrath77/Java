//Implementing ActionListener in Java Swing to Change JTextArea Colors"
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp9_1 {
    public Exp9_1() {
        // Create the frame
        JFrame jframe = new JFrame("Action Listener");
        jframe.setLayout(null);
        jframe.setSize(400, 400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and add the text area
        JTextArea jtextarea = new JTextArea();
        jtextarea.setBounds(50, 50, 300, 200); // Set appropriate bounds
        jframe.add(jtextarea);

        // Create and add the button
        JButton b1 = new JButton("Change Colour");
        b1.setBounds(150, 270, 120, 30); // Set appropriate bounds
        jframe.add(b1);

        // Create and add the label
        JLabel jlabel = new JLabel("");
        jlabel.setBounds(50, 320, 300, 20); // Set appropriate bounds
        jframe.add(jlabel);

        // Add action listener to the button
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jtextarea.setBackground(Color.YELLOW);
                jtextarea.setForeground(Color.GREEN);
                jlabel.setText("Text area color changed!"); // Update the label text
            }
        });

        // Make the frame visible
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Exp9_1();
    }
}
