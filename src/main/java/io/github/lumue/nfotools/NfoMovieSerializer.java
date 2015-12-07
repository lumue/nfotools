package io.github.lumue.nfotools;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/**
 * Created by lm on 07.12.15.
 */
public class NfoMovieSerializer{

    private final JAXBContext jaxbContext;

    public NfoMovieSerializer(JAXBContext jaxbContext) {
        this.jaxbContext = Objects.requireNonNull(jaxbContext);
    }



    public void serialize(Movie object, OutputStream outputStream) throws JAXBException {
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(object,outputStream);
    }


    public Movie deserialize(InputStream inputStream) throws JAXBException {
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        return (Movie) unmarshaller.unmarshal(inputStream);
    }
}
