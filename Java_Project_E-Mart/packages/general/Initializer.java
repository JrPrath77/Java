package packages.general;

import java.util.concurrent.ConcurrentHashMap;
import packages.general.ExceptionHandler;
import packages.general.Queue;
import packages.connection.handler.IOHandler;

public class Initializer{
    public static ConcurrentHashMap<String, IOHandler> connections = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, String> response = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, String> acknowledge = new ConcurrentHashMap<>();
    public static Queue request_queue = new Queue(100);
    public static ExceptionHandler eHandeler = new ExceptionHandler();
    public static String [] serverconnection_ids = new String[9];
}