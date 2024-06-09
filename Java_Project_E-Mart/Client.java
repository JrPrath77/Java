
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("server_domain_name", 8080)) {
            // Send request to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello Me client aahe vadapav aaheka tumchyat?");

            // Receive response from server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = in.readLine();
            System.out.println("Server response: " + response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
