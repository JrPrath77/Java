import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp9_5 {
    public Exp9_5() {
        // Create the frame
        JFrame jframe = new JFrame("Window Listener Demo");
        jframe.setLayout(null);
        jframe.setSize(400, 300);
        jframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // Handle close operation manually

        // Create a label to display window event messages
        JLabel jlabel = new JLabel("Perform window operations and see the messages here.");
        jlabel.setBounds(20, 100, 360, 30);
        jlabel.setHorizontalAlignment(SwingConstants.CENTER);
        jlabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jframe.add(jlabel);

        // Add a custom window listener to the frame
        jframe.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                jlabel.setText("Window Opened");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(jframe, "Are you sure you want to close the window?", "Close Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    jframe.dispose();
                }
            }

            @Override
            public void windowClosed(WindowEvent e) {
                // This will be called after the window is closed (dispose() method)
                System.out.println("Window Closed");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                jlabel.setText("Window Minimized");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                jlabel.setText("Window Restored");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                jlabel.setText("Window Activated");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                jlabel.setText("Window Deactivated");
            }
        });

        // Make the frame visible
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Exp9_5();
    }
}

/*
Explanation:
Frame Setup:

A JFrame is created with a specific size and layout. The DO_NOTHING_ON_CLOSE option is used to customize the close operation.
Label Creation:

A JLabel is added to the frame to display messages corresponding to window events. It is centered within the frame and has a border for better visibility.
Window Listener:

A WindowListener is added to the frame. The WindowListener interface requires implementing seven methods:
windowOpened(WindowEvent e): Called when the window is first opened.
windowClosing(WindowEvent e): Called when the user attempts to close the window (clicking the close button). Here, a confirmation dialog is shown to ask the user if they really want to close the window.
windowClosed(WindowEvent e): Called after the window has been closed (disposed).
windowIconified(WindowEvent e): Called when the window is minimized (iconified).
windowDeiconified(WindowEvent e): Called when the window is restored from minimized state (deiconified).
windowActivated(WindowEvent e): Called when the window becomes the active window.
windowDeactivated(WindowEvent e): Called when the window is no longer the active window.
Handling Close Operation:

In the windowClosing method, a confirmation dialog (JOptionPane.showConfirmDialog) is used to confirm if the user really wants to close the window. If the user selects "Yes", the window is closed using jframe.dispose().
Visibility:

The frame is made visible at the end of the constructor.
Key Points:
WindowListener Interface:
The WindowListener interface allows handling various window events such as opening, closing, minimizing, restoring, and changing the active state.

Customizing Close Operation:
The program asks for confirmation before closing the window, providing a safeguard against accidental closure.

Event Handling:
Each method in the WindowListener interface provides a way to react to specific window events, enhancing the interactivity and responsiveness of the application.

This example demonstrates how to listen for and handle window events in a Java Swing application, making it useful for applications that need to respond to changes in the window state.
 */