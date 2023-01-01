package ser_deserialization;

import jakarta.jws.WebService;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebService
public class Application_3 {
    public static void main(String[] args) throws ParseException, JAXBException {
        Operations operations = new Operations(new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"));
        operations.getOperation().add(new Operation("CREDIT",new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),3454.45,"Virement"));
        operations.getOperation().add(new Operation("DEBIT",new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),34342.45,"Virement"));
        Releve releve = new Releve("23458675",new SimpleDateFormat("dd/MM/yyyy").parse("10/10/2022"),1200.89,operations);
        System.out.println(releve.toString());


        //serialization
        JAXBContext jaxbContext = JAXBContext.newInstance(Releve.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
        marshaller.marshal(releve, new File("releve.xml"));

    }
}

