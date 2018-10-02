package io.github.lumue.nfotools;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

/**
 * test nfo serialization of a movie entity
 */
public class NfoMovieSerializerTest {

    private final static Movie TESTMOVIE =
            Movie.builder()
                    .withTitle("Who knows")
                    .withOriginaltitle("Who knows for real")
                    .withSorttitle("Who knows 1")
                    .withSet("Who knows trilogy")
                    .withRating("6.100000")
                    .withYear("2008")
                    .withTop250("0")
                    .withVotes("50")
                    .withOutline("A look at the role of the Buckeye State in the 2004 Presidential Election.")
                    .withPlot("A look at the role of the Buckeye State in the 2004 Presidential Election.")
                    .withTagline("")
                    .withRuntime("90")
                    .withThumb("http://ia.ec.imdb.com/media/imdb/01/I/25/65/31/10f.jpg")
                    .withMpaa("Not available")
                    .withPlaycount("0")
                    .withId("tt0432337")
                    .withFilenameandpath("/Dummy_Movie_Files/Movies/So Goes The Nation.avi")
                    .withTrailer("")
                    .withGenre("")
                    .withCredits("")
                    .withTag("tag1")
                    .withTag("tag2")
                    .withDirector("Adam Del Deo")
                    .addActor(new Movie.Actor("Paul Begala", "Himself"))
                    .withDateAdded(LocalDateTime.of(2018,01,01,00,00))
                    .withAired(LocalDateTime.of(2017,12,01,00,00))
                    .build();

    @Test
    public void testSerialize() throws Exception {
        NfoMovieSerializer serializer = createSerializer();
        OutputStream outputStream=new FileOutputStream("test_out.nfo");
        serializer.serialize(TESTMOVIE,outputStream);
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
        assertEquals("deserialized object should equal the testmovie bean",TESTMOVIE,result);
    }
}