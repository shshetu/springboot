package com.shetu.tacocloud.temporary.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexFindText {
    public static void main(String[] args) {
        //Input String for matching regex pattern
        String inputStr = "This is an apple. These are 33 (thirty-three) apples.";
        //Regex to be matched
        String regex = "Th";
        //Pattern compile
        Pattern pattern = Pattern.compile(regex);
        //Create Matcher
        Matcher matcher = pattern.matcher(inputStr);
        //test 3 methods: find(), matches(), lookingAt()
        while(matcher.find()){
            System.out.println("find() found substring \""+matcher.group()
            +"\" starting at index "+matcher.start()+" and ending at index: "
            +matcher.end());
        }
        // Try Matcher.matches(), which tries to match the entire input string
        if(matcher.matches()){
            System.out.println("matches() found substring: "+matcher.group()+
            " starting at index: "+matcher.start()+" and ending at index: "
            +matcher.end());
        }else {
            System.out.println("matches() found nothing!");
        }
        //Matcher.lookingAt() tries to match from the beginning of the input string
        if(matcher.lookingAt()){
            System.out.println("lookingAt() found substring: "+matcher.group()
            +" starting at index: "+matcher.start()+" ending at index: "+matcher.end());
        }else {
            System.out.println("lookingAt() found nothing!");
        }
    }
}
