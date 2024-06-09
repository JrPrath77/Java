import java.sql.*;
// CreateTableAndInsert
public class Exp10_1 {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/delivery_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Patil@123";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = con.createStatement()) {

            // Creating a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Customer (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), email VARCHAR(255))";
            stmt.executeUpdate(createTableSQL);

            // Inserting values into the table
            String insertDataSQL = "INSERT INTO Customer (name, email) VALUES ('John Doe', 'john@example.com')";
            int rowsAffected = stmt.executeUpdate(insertDataSQL);
            if (rowsAffected > 0) {
                System.out.println("Data inserted successfully.");
            } else {
                System.out.println("Failed to insert data.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
