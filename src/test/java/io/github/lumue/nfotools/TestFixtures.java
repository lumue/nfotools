package io.github.lumue.nfotools;

import java.time.LocalDateTime;

public class TestFixtures {
    final static Movie TESTMOVIE =
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
}
