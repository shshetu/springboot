package com.shetu.unittesting.unitTesting.Ex4;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner1 {
    public static void main(String[] args) {
        //insert the Class: TestJunit1 inside the runClasses method
        Result result = JUnitCore.runClasses(TestJunit1.class);

        for (Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
