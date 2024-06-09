package packages.connection.server;

import java.io.*;
import java.net.*;
// import java.lang.*;
import packages.general.Initializer;
import packages.general.Generator;
import packages.connection.handler.IOHandler;


public class ServerConnection extends Thread{
    private ServerSocket server;
    private Generator connection_id_generator;
    private boolean accept_bool = false;
    public ServerConnection(){
        connection_id_generator = new Generator();
    }

    public boolean createSocket(int port){
        try{
            server = new ServerSocket(port);
        }catch(IOException e){
            Initializer.eHandeler.handle(e);
            return false;
        }
        return true;
    }

    public void acceptRequest(){
        accept_bool = true;
        this.start();
    }

    public void run(){
        while(accept_bool){
            Socket client;
            try{
                client = server.accept();
                    BufferedReader in;
                    PrintWriter out;
                    try{
                        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        out = new PrintWriter(client.getOutputStream(), true);
                            String id = connection_id_generator.generateId();
                            out.println(id);
                            IOHandler handler = new IOHandler("0" + id, "0",  in, out, client);
                            handler.start();
                            Initializer.connections.put("0"+id, handler);
                    }catch(IOException e){
                        Initializer.eHandeler.handle(e);
                        in = null;
                        out = null;
                    }
            }catch(IOException e){
                Initializer.eHandeler.handle(e);
                accept_bool = false;
            }
        }
    }

    public void stopAcceptingRequest(){
        accept_bool = false;
    }

    public boolean isAccepting(){
        return accept_bool;
    }

}