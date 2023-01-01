import proxy1.JAXBException_Exception;
import proxy1.Releve;
import proxy1.ReleveWS;
import proxy1.ReleveWS_Service;

public class Client {
    public static void main(String[] args) throws JAXBException_Exception {
        ReleveWS stub = new ReleveWS_Service().getReleveWSPort();
        Releve rel1 = stub.getReleve();
        System.out.println(rel1.toString());



    }
}
