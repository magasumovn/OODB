package lab3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class DataBase {
    public static void save(Collection collection) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Collection.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(collection, new File("src/main/java/lab3/shops.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static Collection load() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Collection.class);
            Unmarshaller un = jaxbContext.createUnmarshaller();

            return (Collection) un.unmarshal(new File("src/main/java/lab3/shops.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }
}
