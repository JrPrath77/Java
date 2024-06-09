package packages.connection.client;

import java.net.*;
import java.io.*;
import packages.general.Initializer;
import packages.connection.handler.IOHandler;

public class ClientConnection{
    Socket server;
    BufferedReader in;
    PrintWriter out;
    String connection_status = "Tried To Connect With IP:- ";
    public static int server_num = 1; 
    public ClientConnection(String ip, int port){
        connection_status += ip + "\nPort:- "+  port;
        try{
            server = new Socket(ip, port);
            if(server!=null){
                in = new BufferedReader(new InputStreamReader(server.getInputStream()));
                out = new PrintWriter(server.getOutputStream(), true);
                if(in != null && out != null){
                    String id = Integer.toString(server_num) + in.readLine();
                    IOHandler handler = new IOHandler(id, "1",  in, out, server);
                    handler.start();
                    Initializer.connections.put(id, handler);
                    Initializer.serverconnection_ids[server_num-1] = id;
                    server_num++;
                    connection_status += "\nConnection Status:- Connected";
                }
            }
        }catch(IOException e){
            connection_status += "\nConnection Status:- Not Connected";
            Initializer.eHandeler.handle(e);
        }
    }
    public String getConnectionStatus(){
        return connection_status;
    }
}