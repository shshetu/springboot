package com.example.unittest1.junitEx1;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestCase2 {
    //runs only once before starting all the tests
    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("before class");
    }
    //this method will be invoked before each test
    @Before
    public void setUp() throws Exception{
        System.out.println("before");
    }
    //this is the test method
    @Test
    public void testFindMax(){
        System.out.println("test case find max");
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-2,Calculation.findMax(new int[]{-12,-3,-4,-2}));
    }

    //this is the test method
    @Test
    public void testReverseWord(){
        System.out.println("test case reverse word");
        assertEquals("ym eman si nahk",Calculation.reverseWord("my name is khan"));
    }
    //this method will be invoked after each test
    @After
    public void tearDown() throws Exception{
        System.out.println("after");
    }

    ///this method will be invoked once after all the tests
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("after class");
    }

}
