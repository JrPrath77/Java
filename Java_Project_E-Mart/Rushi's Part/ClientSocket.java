import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientSocket{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter Ip Address: ");
            try(Socket socket = new Socket("2401:4900:1909:6e70:6029:b493:3a73:467e", 8090)){
                System.out.println(socket);
                socket.setSoTimeout(100000);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                out.println("Hello From Client");
                while(true){
                    System.out.println("Enter Message");
                    String msg = scan.next();
                    if(msg.equals("stop"))   break;
                    out.println(msg);
                    // else00
                    
                }
                socket.close();
            }catch(IOException e){
                System.out.println("ERR: " + e);
            }
        }
    }
}