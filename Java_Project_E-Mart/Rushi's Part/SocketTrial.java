
import java.io.*;
import java.net.*;

class Processor extends Thread{
    private Socket client;
    Processor(Socket c){
        client =  c;
    }
    public void run(){
        try(BufferedReader in = new  BufferedReader(new InputStreamReader(client.getInputStream()))){
            while(true){
                String request = in.readLine();
                System.out.println(request);
            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}


public class SocketTrial{
    public static void main(String [] args){
        try(ServerSocket socket = new ServerSocket(8090)){
            System.out.println("Server Started"); 
               int i =0; 
            while(true){
                Socket client = socket.accept();
                // System.out.println("CONNECTED WITH " + client);
                // System.out.println(client.getInputStream());
                // System.out.println(new InputStreamReader(client.getInputStream()));
                // System.out.println(new  BufferedReader(new InputStreamReader(client.getInputStream())));

                // BufferedReader in = new  BufferedReader(new InputStreamReader(client.getInputStream()));
                // String request = in.readLine();
                // System.out.println(request);
             
                Processor [] n =  new Processor[10];
                n[i] = new Processor(client);
                n[i++].start();
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
}