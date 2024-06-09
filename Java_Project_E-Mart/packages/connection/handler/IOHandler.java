package packages.connection.handler;

import java.net.*;
import java.io.*;
import packages.general.*;

public class IOHandler extends Thread{

    private boolean thread_status = true;
    public String connection_id;
    private BufferedReader in;
    private PrintWriter out;
    private Generator generator_for_request;
    private String handler_for;
    private Socket socket;

    public IOHandler(String id, String h, BufferedReader in, PrintWriter out, Socket sc){
        this.in = in;
        this.out = out;
        connection_id = id;
        handler_for = h;
        socket = sc;
        generator_for_request = new Generator();
    }
    
    public String sendRequest(String req_type, String body){
        if(socket==null){
            boolean stoped = stopConnection();
            return "errIO01";
        }
        String message_id = handler_for + generator_for_request.generateId();
        if(!socket.isOutputShutdown() && !socket.isClosed()){
            if(out!=null){
                out.println(message_id + "<split>req<split>" + req_type + "<header-body>" + body);
                if(!out.checkError()){
                    long start_time = System.currentTimeMillis();
                    while(!Initializer.acknowledge.containsKey(connection_id + message_id) && System.currentTimeMillis() - start_time <= 10000);
                    if(Initializer.acknowledge.get(connection_id + message_id)!=null){
                        return connection_id + message_id;
                    }
                    return "errIO04";
                }else{
                    return "errIO02";
                }
            }else{
                try{
                    out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(message_id + "<split>req<split>" + req_type + "<header-body>" + body);
                    if(!out.checkError()){
                        long start_time = System.currentTimeMillis();
                        while(!Initializer.acknowledge.containsKey(connection_id + message_id) && System.currentTimeMillis() - start_time <= 10000);
                        if(Initializer.acknowledge.get(connection_id + message_id)!=null){
                            return connection_id + message_id;
                        }
                        return "errIO04";
                    }else{
                        return "errIO02";
                    }
                }catch(IOException e){
                    Initializer.eHandeler.handle(e);
                    boolean stoped = stopConnection();
                    return "errIO03";
                }
            }
        }
        boolean stoped = stopConnection();
        return "errIO01";
    }
    
    public String sendResponse(String req_id, String body){
        
        if(socket==null){
            boolean stoped = stopConnection();
            return "errIO01";
        }
        if(!socket.isOutputShutdown() && !socket.isClosed()){
            if(out!=null){
                out.println(req_id + "<split>res<header-body>" + body);
                if(!out.checkError()){
                    long start_time = System.currentTimeMillis();
                    while(!Initializer.acknowledge.containsKey(connection_id + req_id) && System.currentTimeMillis() - start_time <= 10000);
                    if(Initializer.acknowledge.get(connection_id + req_id)!=null){
                        return "success";
                    }
                    return "errIO04";
                }else{
                    return "errIO02";
                }
            }else{
                try{
                    out = new PrintWriter(socket.getOutputStream(), true);
                    out.println(req_id + "<split>res<header-body>" + body);
                    if(!out.checkError()){
                        long start_time = System.currentTimeMillis();
                        while(!Initializer.acknowledge.containsKey(connection_id + req_id) && System.currentTimeMillis() - start_time <= 10000);
                        if(Initializer.acknowledge.get(connection_id + req_id)!=null){
                            return "success";
                        }
                        return "errIO04";
                    }else{
                        return "errIO02";
                    }
                }catch(IOException e){
                    Initializer.eHandeler.handle(e);
                    boolean stoped = stopConnection();
                    return "errIO03";
                }
            }
        }
        boolean stoped = stopConnection();
        return "errIO01";
    }

    public void run(){
        while(thread_status){
            String message = null;
            try{
                while(message==null){
                    message = in.readLine();
                }
            }catch(IOException e){
                boolean stopped = stopConnection();
                thread_status  = false;
                break;
            }
            if(message==null || message.equals("interrupt")){
                boolean stopped = stopConnection();
                thread_status  = false;
                break;
            }
            String [] headerBodyArray = message.split("<header-body>");
            String [] header = headerBodyArray[0].split("<split>");
            if(header[1].equals("req")){
                boolean done = Initializer.request_queue.enqueue(connection_id + message);
                if(!done){
                    sendResponse(connection_id + header[0] , "server overfull");
                }else{
                    out.println(header[0] + "<split>ack<header-body>#");
                }
            }else if(header[1].equals("ack")){
                Initializer.acknowledge.put(connection_id + header[0], headerBodyArray[1]);
            }else{
                Initializer.response.put(connection_id + header[0], headerBodyArray[1]);
                out.println(header[0] + "<split>ack<header-body>#");
            }
        }
    }

    public synchronized boolean stopConnection(){
        boolean done = false;
        while(!done){
            done = Initializer.request_queue.enqueue(connection_id + "########<split>req<split>connection_breaked<header-body>#");
        }
        boolean is_stopped = true;
        thread_status = false;
        if(socket!=null){
            if(!socket.isOutputShutdown() && !socket.isClosed()){
                if(out!=null)
                    out.println("interrupt");
                else{
                    try{
                        out = new PrintWriter(socket.getOutputStream(), true);
                        out.println("interrupt");
                    }catch(IOException e){
                        Initializer.eHandeler.handle(e);
                    }
                }
            }
            if(!socket.isOutputShutdown() && !socket.isClosed()){
                try{
                    socket.shutdownOutput();
                    out = null;
                }catch(IOException e){
                    is_stopped = false;
                    Initializer.eHandeler.handle(e);
                }
            }
            if(!socket.isInputShutdown() && !socket.isClosed()){
                try{
                    socket.shutdownInput();
                    in = null;
                }catch(IOException e){
                    is_stopped = false;
                    Initializer.eHandeler.handle(e);
                }
            }
            if(!socket.isClosed()){
                try{
                    socket.close();
                    socket =null;
                }catch(IOException e){
                    Initializer.eHandeler.handle(e);
                    is_stopped = false;
                }
            }
        }
        Initializer.connections.remove(connection_id);
        return is_stopped;
    }

    public void stopAcceptingMessage(){
        thread_status = false;
    }

    public void startAcceptingMessage(){
        thread_status = true;
        this.start();
    }

}