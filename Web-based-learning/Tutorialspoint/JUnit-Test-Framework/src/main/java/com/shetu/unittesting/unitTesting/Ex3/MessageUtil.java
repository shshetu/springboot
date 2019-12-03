package com.shetu.unittesting.unitTesting.Ex3;

public class MessageUtil {
    private String message;

    //constructor

    public MessageUtil(String message) {
        this.message = message;
    }

    //prints the messge
    public String printMessage(){
        System.out.println(message);
        return message;
    }
}
