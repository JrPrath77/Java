// GroupByClause
import java.sql.*;

public class Exp10_3 {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/delivery_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Patil@123";

    public static void main(String[] args) {
        try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = con.createStatement()) {

            String query = "SELECT COUNT(*), State FROM Village_Info GROUP BY State";
            ResultSet rs = stmt.executeQuery(query);

            // Displaying the result
            System.out.println("Count\tState");
            while (rs.next()) {
                int count = rs.getInt(1);
                String state = rs.getString(2);
                System.out.println(count + "\t" + state);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
