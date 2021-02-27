package io.github.lumue.nfotools;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lm on 07.12.15.
 */
public class MovieBuilderTest {

    @Test
    public void testBuildEmpty() throws Exception {
        assertEquals(new Movie(), Movie.builder().build());
    }

    @Test
    public void testCreateCopyBuilder() throws Exception {
        assertEquals(TestFixtures.TESTMOVIE, TestFixtures.TESTMOVIE.copyBuilder().build());
    }
}