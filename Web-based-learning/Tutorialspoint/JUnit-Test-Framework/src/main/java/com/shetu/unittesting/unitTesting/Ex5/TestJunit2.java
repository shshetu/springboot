package com.shetu.unittesting.unitTesting.Ex5;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//extend the TestCase
public class TestJunit2 extends TestCase {
    protected double fValue1;
    protected double fValue2;

    //this method is invoked before each test
    @Before
    public void setUp(){
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd(){
        //count teh number of test cases
        System.out.println("No of Test Case= "+ this.countTestCases());

        //test getName
        String name = this.getName();
        System.out.println("Test Case Name = "+name);

        //test setName
        this.setName("testNewAdd");
        String newName = this.getName();
        System.out.println("Updated Test Case Name = "+newName);
    }


    //tearDown used to close the connection or clean up activites
    @After
    public void tearDown(){
        System.out.println("Tear Down");
    }
}
