package org.example;

import junit.framework.*;
import org.testng.annotations.Test;
import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static junit.framework.Test.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
/**
 * Unit test for simple App.
 */
public class AppTest
{
    @org.junit.Test
    public void testFindmax()
    {
        assertEquals(46,App.Findmax(new int[]{3,5,46,7}));

    }



}
