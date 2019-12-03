package com.shetu.unittesting.unitTesting.Ex1;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;

//old structure: Legecy class
public class JavaTest extends TestCase {
    protected int value1, value2;

    //assigning the values
//    @Before
    protected void setUp() throws Exception{
        value1 = 3;
        value2 = 3;
    }

    ///test method to add two values
//    @Test
    public void testAdd(){
        double result = value1+value2;
        assertTrue(result == 6);
    }

}
