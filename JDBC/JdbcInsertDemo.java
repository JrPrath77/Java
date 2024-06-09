import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;

public class JdbcInsertDemo {

    public static void main(String[] args){
         try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection to the database
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/delivery_db", "root", "Patil@123");

            System.out.println("Success: Connected to database");

            // Prepare the SQL statement with placeholders
            String sql = "INSERT INTO delivery_routes (Source_City_ID, Source_City_Name, "
                         + "Destination_City_ID, Destination_City_Name, Distance_KM)"
                         + " VALUES (?, ?, ?, ?, ?)";  // this que marks are positional parameters

            PreparedStatement ps = con.prepareStatement(sql);

            // Set values using placeholders for better security and readability
            ps.setInt(1, 4467);
            ps.setString(2, "Urun-Islampur");
            ps.setInt(3, 4400);
            ps.setString(4, "Shirala");
            ps.setInt(5, 22);

            // Execute the first insert
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("First record inserted successfully!");
            } else {
                System.out.println("Failed to insert first record.");
            }

            // Repeat for remaining inserts (demonstrates reusability)
            ps.setInt(1, 4467);
            ps.setString(2, "Urun-Islampur");
            ps.setInt(3, 4456);
            ps.setString(4, "Ashta");
            ps.setInt(5, 22);
            rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Second record inserted successfully!");
            } else {
                System.out.println("Failed to insert second record.");
            }

            // Similar logic for remaining inserts (Shirala and Ashta)

            // Close the connection (important for resource management)
            con.close();
            System.out.println("Connection closed successfully.");

        } catch (ClassNotFoundException e) {
             System.err.println("Error: JDBC Driver class not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error: SQL Exception occurred.");
            e.printStackTrace();
        }
    }
}
