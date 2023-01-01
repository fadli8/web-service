package releveWS;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import jakarta.xml.bind.annotation.XmlTransient;
import ser_deserialization.Operation;
import ser_deserialization.Operations;
import ser_deserialization.Releve;

import java.io.File;
import java.util.Date;
import java.util.List;

@WebService(serviceName = "releveWS")
public class releveWS {

   /* @WebMethod
    public List<Operation> ListOperations(){
        return List.of(
                new Operation("CREDIT",new Date(),9000,"Vers Espece"),
                new Operation("DEBIT",new Date(),3400,"Cheque Guichet"),
                new Operation("DEBIT",new Date(),120,"Assurance"),
                new Operation("CREDIT",new Date(),70000,"Virement")
        );
    }*/

    @WebMethod
    @XmlTransient
    public Releve getReleve() throws JAXBException {
        //return new Releve("34134245",new Date("10-10-2022"),2347.54,new Operations(new Date("10-10-2022"),new Date("10-10-2022"),ListOperations()));

        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        Releve releve = (Releve) unmarshaller.unmarshal(new File("releve.xml"));


        return releve;


    }




}