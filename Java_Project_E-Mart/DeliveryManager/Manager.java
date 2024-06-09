/**
 * The Manager class in Java provides methods to manage hubs, delivery routes, zones, and delivery boys
 * in a delivery system using JDBC for database operations.
 */
import packages.connection.server.*;
import packages.general.Initializer.*;
import packages.connection.handler.*;
import packages.connection.handler.Processor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Manager {

    public static void main(String [] args){
        ServerConnection connection= new ServerConnection();
        connection.createSocket(8080);
        connection.acceptRequest();
        Myprocessor obj = new Myprocessor();
        Manager obj1 =new Manager();
        int pincode=415409 ;
        obj1.getVillageByPin(pincode);
    }

    private static final String DB_URL = "jdbc:mysql://localhost:3306/delivery_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "Patil@123";

    private Connection con;

    public Manager() throws SQLException {
        this.con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public void createHub(String hubName) throws SQLException {
        String sql = "INSERT INTO HUB_INFO (HUB_NAME) VALUES (?)";
        try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, hubName);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        int hubId = generatedKeys.getInt(1);
                        System.out.println("New Hub added Successfully with ID: " + hubId);
                    } else {
                        System.out.println("Failed to retrieve generated key");
                    }
                }
            } else {
                System.out.println("Failed to add new hub");
            }
        }
    }

    public void connectHubs(int hub1Id, int hub2Id, double distance) throws SQLException {
        String sql = "INSERT INTO Delivery_Routes (HUB1_ID, HUB2_ID, DISTANCE) VALUES (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, hub1Id);
            ps.setInt(2, hub2Id);
            ps.setDouble(3, distance);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Connected hubs successfully.");
            } else {
                System.out.println("Failed to connect hubs.");
            }
        }
    }

    public void breakConnectedHubs(int hub1Id, int hub2Id) throws SQLException {
        String sql = "DELETE FROM Delivery_Routes WHERE (HUB1_ID = ? AND HUB2_ID = ?) OR (HUB1_ID = ? AND HUB2_ID = ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, hub1Id);
            ps.setInt(2, hub2Id);
            ps.setInt(3, hub2Id);
            ps.setInt(4, hub1Id);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Disconnected hubs successfully.");
            } else {
                System.out.println("Failed to disconnect hubs.");
            }
        }
    }

    public void createZone(int hubId, String zoneName) throws SQLException {
        String sql = "INSERT INTO ZoneInfo (HUB_ID, ZONE_NAME) VALUES (?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, hubId);
            ps.setString(2, zoneName);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Zone created successfully.");
            } else {
                System.out.println("Failed to create zone.");
            }
        }
    }

    public void linkZoneToHub(int hubId, int zoneId) throws SQLException {
        String sql = "UPDATE ZoneInfo SET HUB_ID = ? WHERE ZONE_ID = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, hubId);
            ps.setInt(2, zoneId);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Zone linked to hub successfully.");
            } else {
                System.out.println("Failed to link zone to hub.");
            }
        }
    }

    public void removeZone(int zoneId) throws SQLException {
        String sql = "DELETE FROM ZoneInfo WHERE ZONE_ID = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, zoneId);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Zone removed successfully.");
            } else {
                System.out.println("Failed to remove zone.");
            }
        }
    }

    public void linkDeliveryBoyToZone(int deliveryBoyId, String deliveryBoyName, int zoneId) throws SQLException {
        String sql = "INSERT INTO Delivery_Boy_Info (DELIVERY_BOY_ID, DELIVERY_BOY_NAME, ZONE_ID) VALUES (?, ?, ?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, deliveryBoyId);
            ps.setString(2, deliveryBoyName);
            ps.setInt(3, zoneId);
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Delivery boy linked to zone successfully.");
            } else {
                System.out.println("Failed to link delivery boy to zone.");
            }
        }
    }

    public void close() throws SQLException {
        if (con != null && !con.isClosed()) {
            con.close();
        }
    }

    // main useful funcions
    /*    ● getVillageByPin(pin)

● getDeliveryIstimation(s_pin, s_village, s_tahasil, s_dist, s_state, d_pin, d_village, d_tahasil, d_dist, d_state, weight)

●deliverOrder(s_shopName, s_addrLine1, s_addrLine2, s_pin, s_village, s_tahasil, s_dist, s_state, d_addrLine1, d_addrLine2d_pin, d_village, d_tahasil, d_dist, d_state, order_id)

●trackOrder(deliveryId)

●returnOrder(deliveryId)
     */
    public String getVillageByPin(int pincode) {
        String query = "SELECT * FROM Village_Info WHERE Pincode = ?";
        StringBuilder result = new StringBuilder();
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, pincode);
            ResultSet rs = ps.executeQuery();
            boolean first = true; // Flag to handle the delimiter
            while (rs.next()) {
                String Village_Name1 = rs.getString("Village_Name");
                String Taluka1 = rs.getString("Taluka");
                String District1 = rs.getString("District");
                String State1 = rs.getString("State");
    
                if (!first) {
                    result.append(" <split> "); // Append the delimiter before each new village info
                }
                first = false; // After the first iteration, the flag is set to false
                result.append(Village_Name1)
                      .append(" <split> ").append(Taluka1)
                      .append(" <split> ").append(District1)
                      .append(" <split> ").append(State1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
    
    

    public void getDeliveryIstimation(int s_pin,String s_village,String s_taluka,String s_dist, String s_state,int d_pin,String d_village, String d_taluka,String d_dist,String d_state,String weight){
        // Show selected path .. showen in dijekstras algorithm
    }
    
}
