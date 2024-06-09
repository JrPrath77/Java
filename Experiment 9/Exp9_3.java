import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp9_3 {
    public Exp9_3() {
        // Create the frame
        JFrame jframe = new JFrame("Action Listener");
        jframe.setLayout(null);
        jframe.setSize(400, 300); // Adjusted size for a more compact layout
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create and set bounds for the label
        JLabel jlabel = new JLabel("Checkbox Example");
        jlabel.setBounds(150, 20, 200, 30);
        jframe.add(jlabel);

        // Create the checkboxes with labels and set their bounds
        JCheckBox jcheckbox1 = new JCheckBox("C++");
        jcheckbox1.setBounds(50, 80, 100, 30);
        jframe.add(jcheckbox1);

        JCheckBox jcheckbox2 = new JCheckBox("Java");
        jcheckbox2.setBounds(50, 120, 100, 30);
        jframe.add(jcheckbox2);

        // Create a label to display the status of checkboxes
        JLabel statusLabel = new JLabel("");
        statusLabel.setBounds(50, 160, 300, 30);
        jframe.add(statusLabel);

        // Add action listeners to the checkboxes
        jcheckbox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String status = "C++ Checkbox " + (jcheckbox1.isSelected() ? "Checked" : "Unchecked");
                statusLabel.setText(status);
            }
        });

        jcheckbox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String status = "Java Checkbox " + (jcheckbox2.isSelected() ? "Checked" : "Unchecked");
                statusLabel.setText(status);
            }
        });

        // Make the frame visible
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Exp9_3();
    }
}
