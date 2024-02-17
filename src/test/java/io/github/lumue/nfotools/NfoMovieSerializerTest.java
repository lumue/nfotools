package io.github.lumue.nfotools;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

/**
 * test nfo serialization of a movie entity
 */
public class NfoMovieSerializerTest {

    @Test
    public void testSerialize() throws Exception {
        NfoMovieSerializer serializer = createSerializer();
        OutputStream outputStream=new FileOutputStream("test_out.nfo");
        serializer.serialize(TestFixtures.TESTMOVIE,outputStream);
        outputStream.close();
        assertTrue("file should exist", Files.exists(Paths.get("test_out.nfo")));
        assertTrue("filesize should be > 0", Files.size(Paths.get("test_out.nfo"))>0);
    }

    private NfoMovieSerializer createSerializer() throws JAXBException {
        JAXBContext jaxbContext=JAXBContext.newInstance(Movie.class, Fileinfo.class,Movie.Actor.class);
        return new NfoMovieSerializer(jaxbContext);
    }

    @Test
    public void testDeserialize() throws Exception {
        NfoMovieSerializer serializer = createSerializer();
        InputStream inputStream = NfoMovieSerializerTest.class.getResourceAsStream("example.nfo");
        Movie result=serializer.deserialize(inputStream);
        inputStream.close();
        assertNotNull("deserialized object should not be null",result);
        assertEquals("deserialized object should equal the testmovie bean", TestFixtures.TESTMOVIE,result);
    }

    @Test
    public void testDeserializeOther() throws Exception {
        NfoMovieSerializer serializer = createSerializer();
        InputStream inputStream = NfoMovieSerializerTest.class.getResourceAsStream("realworld_example.nfo");
        Movie result=serializer.deserialize(inputStream);
        inputStream.close();
        assertNotNull("deserialized object should not be null",result);
        assertEquals("1",result.getUserrating());
        assertEquals("2015-08-11 22:39:07",result.getLastplayed());
    }
}