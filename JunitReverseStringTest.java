package org.example;
import junit.framework.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testReverseString()
    {
        assertEquals("pal",App.RevesreString(new String("lap")));
    }

}
