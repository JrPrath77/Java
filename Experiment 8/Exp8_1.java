import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exp8_1 implements ActionListener {
    // Declaring JTextArea at the class level for access in the actionPerformed method
    JTextArea jtextarea;

    // Constructor to setup the GUI
    public Exp8_1() {
        // Create the frame
        JFrame jframe = new JFrame("Job Application Form");
        jframe.setLayout(null);
        jframe.setSize(650, 700);  // Adjusted size for better form layout
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the menu bar and add it to the frame
        JMenuBar menubar = new JMenuBar();
        jframe.setJMenuBar(menubar);

        // Create menus
        JMenu m1 = new JMenu("File");
        JMenu m2 = new JMenu("Edit");
        JMenu m3 = new JMenu("Format");
        JMenu m4 = new JMenu("View");

        // Add menus to the menu bar
        menubar.add(m1);
        menubar.add(m2);
        menubar.add(m3);
        menubar.add(m4);

        // Add menu items to "File" menu
        JMenuItem i1 = new JMenuItem("New");
        JMenuItem i2 = new JMenuItem("Open");
        JMenuItem i3 = new JMenuItem("Save");
        JMenuItem i4 = new JMenuItem("Save As");
        JMenuItem exitItem = new JMenuItem("Exit"); // Create Exit menu item
        m1.add(i1);
        m1.add(i2);
        m1.add(i3);
        m1.add(i4);
        m1.addSeparator(); // Add a separator line before Exit
        m1.add(exitItem);

        // Add menu items to "Edit" menu
        JMenuItem i5 = new JMenuItem("Cut");
        JMenuItem i6 = new JMenuItem("Copy");
        JMenuItem i7 = new JMenuItem("Paste");
        JMenuItem i8 = new JMenuItem("Delete");
        JMenuItem i9 = new JMenuItem("Select All");
        m2.add(i5);
        m2.add(i6);
        m2.add(i7);
        m2.add(i8);
        m2.add(i9);

        // Add menu items to "Format" menu
        JMenuItem i10 = new JMenuItem("Word Wrap");
        JMenuItem i11 = new JMenuItem("Font");
        m3.add(i10);
        m3.add(i11);

        // Add submenu and items to "View" menu
        JMenu m6 = new JMenu("Zoom");
        JMenuItem i12 = new JMenuItem("Status Bar");
        m4.add(m6);
        m4.add(i12);
        JMenuItem i13 = new JMenuItem("Zoom In");
        JMenuItem i14 = new JMenuItem("Zoom Out");
        JMenuItem i15 = new JMenuItem("Restore Default Zoom");
        m6.add(i13);
        m6.add(i14);
        m6.add(i15);

        // Add action listener to Exit menu item
        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int confirm = JOptionPane.showConfirmDialog(jframe, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0); // Closes the application
                }
            }
        });

        // Create the text area and add it to the frame
        jtextarea = new JTextArea();
        jtextarea.setBounds(20, 20, 600, 600); // Set appropriate bounds
        jframe.add(jtextarea);

        // Attach action listeners to "Edit" menu items
        i5.addActionListener(this); // Cut
        i6.addActionListener(this); // Copy
        i7.addActionListener(this); // Paste

        // Make the frame visible
        jframe.setVisible(true);
    }

    // Implementing the actionPerformed method
    @Override
    public void actionPerformed(ActionEvent e) {
        // Determine which menu item was clicked
        String command = e.getActionCommand();

        switch (command) {
            case "Cut":
                jtextarea.cut();
                break;
            case "Copy":
                jtextarea.copy();
                break;
            case "Paste":
                jtextarea.paste();
                break;
            default:
                // Handle other actions if needed
                break;
        }
    }

    public static void main(String[] args) {
        new Exp8_1(); // Instantiate the GUI application
    }
}
