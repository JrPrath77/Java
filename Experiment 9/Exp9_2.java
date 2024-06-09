import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exp9_2 extends JFrame implements ActionListener {

    // Global variables
    private CardLayout card;
    private JButton btn1, btn2, btn3;
    private Container cPane;

    public Exp9_2() {
        // Create container and set CardLayout
        cPane = getContentPane();
        card = new CardLayout(); // Removed spacing arguments
        cPane.setLayout(card);

        // Create buttons and add action listeners
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        // Add buttons to the container with card names
        cPane.add(btn1, "Card 1"); // Corrected the order of arguments
        cPane.add(btn2, "Card 2");
        cPane.add(btn3, "Card 3");
    }

    public void actionPerformed(ActionEvent e) {
        // Switch cards on button click
        card.next(cPane);
    }

    public static void main(String[] args) {
        Exp9_2 frame = new Exp9_2();
        frame.setTitle("Card Layout Demo");
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Added to close the application properly
    }
}


/*
In Swing, `cPane` typically stands for the content pane of a `JFrame`. The content pane is a container that holds the main components of the frame, such as buttons, labels, text fields, and other GUI elements.

Here's what `cPane` represents in the provided code:

```java
private Container cPane;
```

In the constructor `Exp9_2()`, `cPane` is initialized as the content pane of the `JFrame`:

```java
cPane = getContentPane(); // Get the content pane of the frame
```

Later, in the same constructor, `cPane` is used to set the layout and add components:

```java
cPane.setLayout(card); // Set the layout of the content pane to CardLayout
cPane.add(btn1, "Card 1"); // Add buttons to the content pane with card names
cPane.add(btn2, "Card 2");
cPane.add(btn3, "Card 3");
```

So, in summary, `cPane` is a reference to the content pane of the `JFrame`, which is where the GUI components are added and managed. It's a common practice to use `cPane` or a similar name to refer to the content pane in Swing applications.
 */