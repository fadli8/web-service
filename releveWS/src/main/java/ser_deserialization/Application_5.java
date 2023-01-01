package ser_deserialization;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.SchemaOutputResolver;

import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class Application_5 {
    public static void main(String[] args) throws JAXBException, IOException {
        JAXBContext jaxbContext= JAXBContext.newInstance(Releve.class);
        jaxbContext.generateSchema(new SchemaOutputResolver() {
            @Override
            public Result createOutput(String s, String s1) throws IOException {
                File f = new File("releve.xsd");
                StreamResult result = new StreamResult(f);
                result.setSystemId(f.getName());
                return result;
            }
        });
    }
}
