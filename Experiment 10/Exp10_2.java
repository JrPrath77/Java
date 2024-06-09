// AlterUpdateDelete
import java.sql.*;

public class Exp10_2 {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/delivery_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Patil@123";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = con.createStatement()) {

            // Altering table - Adding a new column
            String alterTableSQL = "ALTER TABLE Customer ADD COLUMN phone VARCHAR(15)";
            stmt.executeUpdate(alterTableSQL);
            System.out.println("Table altered successfully.");

            // Updating data in the table
            String updateDataSQL = "UPDATE Customer SET phone = '1234567890' WHERE id = 1";
            int rowsAffected = stmt.executeUpdate(updateDataSQL);
            System.out.println(rowsAffected + " row(s) updated.");

            // Deleting data from the table
            String deleteDataSQL = "DELETE FROM Customer WHERE id = 1";
            rowsAffected = stmt.executeUpdate(deleteDataSQL);
            System.out.println(rowsAffected + " row(s) deleted.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
