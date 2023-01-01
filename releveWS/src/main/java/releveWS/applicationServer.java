package releveWS;

import jakarta.xml.ws.Endpoint;

public class applicationServer {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:9191/",new releveWS());
        System.out.println("web service déployé sur http://0.0.0.0:9191/");
    }
}
