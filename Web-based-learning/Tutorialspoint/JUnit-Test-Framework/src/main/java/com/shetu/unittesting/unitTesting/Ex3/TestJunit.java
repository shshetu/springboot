package com.shetu.unittesting.unitTesting.Ex3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit {
    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        assertEquals(message,messageUtil.printMessage());
    }
}
