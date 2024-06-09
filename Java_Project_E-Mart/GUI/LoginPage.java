import javax.swing.*;


// Assuming you have a class representing a Parcel object
JPanel incomingParcelsPanel = new JPanel();
JTable incomingParcelsTable = new JTable(new IncomingParcelsTableModel()); // Model holds parcel data
JScrollPane scrollPane = new JScrollPane(incomingParcelsTable);
incomingParcelsPanel.add(scrollPane);

// "Mark Received" button for each row can be implemented in the TableModel

incomingParcelsPanel.add(new JButton("View Details")); // Add button to open details window

// Similar approach for Outgoing Parcels section and other functionalities


public class LoginPage extends JFrame {

    public LoginPage() {
        super("Hub Administration Login");
        // ... create and arrange UI components (text fields, button, link) ...
        pack();
        setLocationRelativeTo(null); // Center the window on screen
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
