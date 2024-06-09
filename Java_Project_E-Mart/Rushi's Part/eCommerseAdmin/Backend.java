import java.io.*;
import java.net.*;

class HandleIO extends Thread{
    private Socket client;
    HandleIO(Socket c){
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

class LiveServer extends Thread{
    ServerSocket socket;
    private int port;
    private int i =0;
    private HandleIO [] newUser = new HandleIO [100];
    LiveServer(int p){
        port = p;
    }
    public void run(){
        try(socket = new ServerSocket(port)){
            System.out.println("Server Is Live At "+ port);  
            while(true){
                HandleIO newUser[i] = new HandleIO(socket.accept());
                newUser[i].run();
                i++;
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

class Processor{

}

public class Backend{
    public static void main(String [] args){

    }
}