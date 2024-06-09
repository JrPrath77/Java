import packages.DeliveryManager.*;

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

public class Main {
    public static void main(String args[]){

    }
}

class Myprocessor extends  Processor{
    public String request;
    public void run(){
    request=getRequest();
    String [] a=request.split("<header-body>");
    String [] header= a[0].split("<split>");

    System.out.println(request);
    switch(header[2]){
     case "getVillageByPin":  
        //String response = getVillageByPin(bodyString); // Call getVillageByPin() based on body
        System.out.println(request);
        String response="1<split>islampur<split>walawa<split>sangli<split>2<split>aitvade khurd<split>walawa<split>Sangli";
        System.out.println(sendResponse(header[0], response));
        

        break;

                // logic (string madhe store karun rushi la patav)-> give nav taluka jilha ani primary key
                // use sent response function... for sending message to rushi
        
        /* below down in string array 
         1<split>islampur<split>walawa<split>sangli<split>2<split>aitvade khurd<split>walawa<split>Sangli
         
         request header-> request/response/
         */
    }
}
}