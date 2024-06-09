
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp9_4 {
    // Constructor to set up the GUI
    public Exp9_4() {
        // Create the frame
        JFrame jframe = new JFrame("Mouse Listener Demo");
        jframe.setLayout(null);
        jframe.setSize(400, 300);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label to display messages
        JLabel jlabel = new JLabel("Interact with me using the mouse!");
        jlabel.setBounds(50, 100, 300, 30);
        jlabel.setHorizontalAlignment(SwingConstants.CENTER); // Center the text
        jlabel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Add a border for visibility
        jframe.add(jlabel);

        // Create a custom mouse listener and add it to the label
        jlabel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jlabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                jlabel.setText("Mouse Pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                jlabel.setText("Mouse Released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                jlabel.setText("Mouse Entered");
                jlabel.setBackground(Color.LIGHT_GRAY);
                jlabel.setOpaque(true); // Ensure background color is visible
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jlabel.setText("Mouse Exited");
                jlabel.setBackground(null);
                jlabel.setOpaque(false);
            }
        });

        // Make the frame visible
        jframe.setVisible(true);
    }

    public static void main(String[] args) {
        new Exp9_4();
    }
}

/* 
### Explanation:

1. **Frame Setup**:
   - `JFrame` is created and configured with a title, size, layout, and close operation.

2. **Label Creation**:
   - A `JLabel` is created to display messages when mouse events occur. It has a border for better visibility and is centered horizontally within its bounds.

3. **Mouse Listener**:
   - A `MouseListener` is added to the `JLabel`. The `MouseListener` interface requires implementing five methods:
     - `mouseClicked(MouseEvent e)`: Called when the mouse is clicked (pressed and released).
     - `mousePressed(MouseEvent e)`: Called when the mouse button is pressed.
     - `mouseReleased(MouseEvent e)`: Called when the mouse button is released.
     - `mouseEntered(MouseEvent e)`: Called when the mouse enters the component's area.
     - `mouseExited(MouseEvent e)`: Called when the mouse exits the component's area.
   - Each method updates the label's text to reflect the mouse interaction and provides some interactivity, such as changing the label's background color when the mouse enters or exits.

4. **Visibility**:
   - The frame is made visible at the end of the constructor.

### Key Points:

- **`MouseListener` Interface**:
  The `MouseListener` interface provides methods to respond to various mouse events on a component.

- **`JLabel` Interactions**:
  The label updates its text and background color based on the mouse events, giving immediate feedback to the user.

- **Position and Size with `setBounds()`**:
  The `setBounds()` method positions and sizes the label within the frame using absolute positioning (manual layout management).

This example demonstrates how to handle mouse events in a Swing application, providing a responsive user interface.
*/