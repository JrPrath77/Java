package packages.connection.handler;

import packages.general.Initializer;

public class Processor extends Thread{
    public Processor(){
        this.start();
    }
    public String getRequest(){    
        return Initializer.request_queue.dequeue();
    }
    public String getResponse(String id, int waitTime){
        long start_time = System.currentTimeMillis();
        while(!Initializer.response.containsKey(id) && System.currentTimeMillis() - start_time <= waitTime);
        String response = Initializer.response.get(id);
        if(response!=null)
            return response;
            return "errP01";
    }
    public String sendRequest(String id, String req_type, String body){
        if(Initializer.connections.containsKey(id)){
            String msg_id =  Initializer.connections.get(id).sendRequest(req_type, body);
            return msg_id;
        }
        return  "errP02";
    }
    public String sendResponse(String req_id, String body){
        if(Initializer.connections.containsKey(req_id.substring(0, 8))){
            return Initializer.connections.get(req_id.substring(0, 8)).sendResponse(req_id.substring(8, 16), body);
        }else{
            return "errP02";
        }
    }
    public void stopAccepting(String id){
        if(Initializer.connections.containsKey(id)){
            Initializer.connections.get(id).stopAcceptingMessage();
        }
    }
    public void startAccepting(String id){
        if(Initializer.connections.containsKey(id)){
            Initializer.connections.get(id).startAcceptingMessage();
        }
    }
    public boolean stopConnection(String id){
        if(Initializer.connections.containsKey(id)){
            return Initializer.connections.get(id).stopConnection();  
        }
        return false;
    }
}