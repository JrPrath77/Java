import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;
import java.sql.ResultSet;

public class Jdbc1 {
    public static void main(String args[])throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        

    }
}

 class Manager{
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/delivery_db", "root", "Patil@123");

    public void createHub(String hubName) throws SQLException {
        /* Add new hubs in the HUB_INFO table */
        // find way to autoincrement hub_id's after adding to database----> Statement.RETURN_GENERATED_KEYS
        String sql = "INSERT INTO HUB_INFO (HUB_NAME) VALUES (?)";
        PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setString(1, hubName); // hubname added to first position of que mark

        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                int hubId = generatedKeys.getInt(1);
                System.out.println("New Hub added Succesfully with ID: " + hubId);
            } else {
                System.out.println("Failed to retrieve generated key");
            }
        } else {
            System.out.println("Failed to add new hub");
        }

        ps.close(); // Close the prepared statement
    }

    public void ConnectHubs(){
        /* find nearby hubs and distance between them and add to Delivery_Routes table */
    }
    public void breakConnectedHubs(){
        /* need to make changes in delivery_route table and this need to perform when we add new hub between two hubs ---- so we also need to update zoneid of villages */

    }
    
    public void createZone(){
        /* this function need to perform when we add new hub and then Add  villages in the zone.. and connect that villages to the hub */

    }
    public void linkZoneToHub(){
        /* add hubid in the column of zoneinfo table as a foreign key */
    }
    public void RemoveZone(){
        /* Drop row from hubinfo table and drop cell from  Zoneinfo table of that specific hubid*/
    }

    public void linkDeliveryBoyToZone(){
        /* add delivery boy id and name in the table Delivery_Boy_Info */
    }
 }

*/