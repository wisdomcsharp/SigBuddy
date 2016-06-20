package HTTPhandle;

/**
 * Created by Wisdom on 14/06/2016.
 */

import java.net.InetSocketAddress;

import HTMLDocument.Websites;
import com.sun.net.httpserver.HttpServer;
import com.sun.org.apache.xpath.internal.operations.String;


public class Handle {
    public HttpServer server;

    public Handle(){
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8000),0);
            server.createContext("/", new Request());
            server.setExecutor(null); // creates a default executor
            server.start();
            this.server = server;
        }catch(Exception Ex){

        }
    }

}

