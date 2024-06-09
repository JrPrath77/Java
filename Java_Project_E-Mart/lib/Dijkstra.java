import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class Dijkstra {

    // Method to establish database connection
    public static Connection connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/delivery_db";
        String user = "root";
        String password = "Patil@123";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // Method to fetch data from the database
    public static Map<String, List<Edge>> fetchGraphData(Connection conn) {
        Map<String, List<Edge>> graph = new HashMap<>();

        try {
            Statement stmt = conn.createStatement();
            String query = "SELECT * FROM Hub_to_hub;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String village = rs.getString("City");
                String nearbyVillage = rs.getString("Nearby_City/Cities");
                int distance = rs.getInt("Distance");
                // Assuming bidirectional travel
                graph.computeIfAbsent(village, k -> new ArrayList<>()).add(new Edge(nearbyVillage, distance));
                graph.computeIfAbsent(nearbyVillage, k -> new ArrayList<>()).add(new Edge(village, distance));
            }

            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return graph;
    }

    public static void main(String[] args) {
        Connection conn = connectToDatabase();
        if (conn != null) {
            Map<String, List<Edge>> graph = fetchGraphData(conn);
            String startVillage = "Pune";
            String endVillage = "Sangli";

            DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
            DijkstraResult result = dijkstra.findShortestPath(startVillage, endVillage);

            System.out.println("The minimum distance from " + startVillage + " to " + endVillage + " is " + result.distance + " KM.");
            System.out.println("The path is: " + String.join(" -> ", result.path));
        }
    }
}

class Edge {
    String target;
    int weight;

    public Edge(String target, int weight) {
        this.target = target;
        this.weight = weight;
    }
}

class Node {
    String village;
    int distance;

    public Node(String village, int distance) {
        this.village = village;
        this.distance = distance;
    }
}

class DijkstraAlgorithm {
    private final Map<String, List<Edge>> graph;

    public DijkstraAlgorithm(Map<String, List<Edge>> graph) {
        this.graph = graph;
    }

    public DijkstraResult findShortestPath(String start, String end) {
        PriorityQueue<Node> queue = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        Map<String, Integer> distances = new HashMap<>();
        Map<String, String> previous = new HashMap<>();

        for (String village : graph.keySet()) {
            distances.put(village, Integer.MAX_VALUE);
        }
        distances.put(start, 0);
        queue.add(new Node(start, 0));

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();
            String currentVillage = currentNode.village;

            if (currentVillage.equals(end)) break;

            for (Edge edge : graph.getOrDefault(currentVillage, Collections.emptyList())) {
                int newDist = distances.get(currentVillage) + edge.weight;

                if (newDist < distances.get(edge.target)) {
                    distances.put(edge.target, newDist);
                    previous.put(edge.target, currentVillage);
                    queue.add(new Node(edge.target, newDist));
                }
            }
        }

        List<String> path = new ArrayList<>();
        for (String at = end; at != null; at = previous.get(at)) {
            path.add(at);
        }
        Collections.reverse(path);

        return new DijkstraResult(distances.get(end), path);
    }
}

class DijkstraResult {
    int distance;
    List<String> path;

    public DijkstraResult(int distance, List<String> path) {
        this.distance = distance;
        this.path = path;
    }
}

