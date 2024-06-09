import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Provide the database URL and credentials
            String url = "jdbc:mysql://localhost:3306/delivery_db";
            String user = "root";
            String password = "Patil@123";

            // Establish the database connection
            connection = DriverManager.getConnection(url, user, password);

            if (connection != null) {
                System.out.println("Connected to the database");
            } else {
                System.out.println("Failed to connect to the database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // Close the connection
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
