package com.example.xmlprocessing.utils.serialize;

import com.example.xmlprocessing.utils.serialize.exceptions.SerializeException;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

@Component(value = "XmlSerializer")
public class XMLSerializer implements Serializer {


    @Override
    public <T> void serialize(T t, String fileName) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(t.getClass());
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            String path = System.getProperty("user.dir") + File.separator + fileName;
            File f = new File(path);
            if (!f.exists()) {
                //getParentFile -> path to files.input/output.
                // mkdirs() -> creates directories that didn't exist
                f.getParentFile().mkdirs();
                f.createNewFile();
            }

            try ( OutputStream outputStream = new FileOutputStream(fileName);
                  BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(outputStream))) {
                marshaller.marshal(t, bfw);
            }
        } catch (JAXBException e) {
            //log here...
            throw  new SerializeException("Could not serialize " + t + "! ", e);
        } catch (IOException ioe) {
            //log here...
            throw  new SerializeException("Could not serialize " + t + "! Unable to write file" + fileName + "!", ioe);
        }
    }

    @Override
    public <T> T deserialize(Class<T> clazz, String fileName) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            try ( InputStream inputStream = clazz.getResourceAsStream(fileName);
                  BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
                T t = (T) unmarshaller.unmarshal(reader);
                return t;
            }
        } catch (JAXBException e) {
            //log here...
            throw  new SerializeException("Could not deserialize to class " + clazz + "! ", e);
        } catch (IOException ioe) {
            //log here...
            throw  new SerializeException("Could not deserialize class " + clazz + "! Unable to read from file" + fileName + "!", ioe);
        }
    }
}
