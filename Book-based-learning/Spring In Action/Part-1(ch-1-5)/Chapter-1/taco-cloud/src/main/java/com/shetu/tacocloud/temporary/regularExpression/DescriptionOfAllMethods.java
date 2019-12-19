package com.shetu.tacocloud.temporary.regularExpression;
import java.util.*;
import java.util.regex.*;

public class DescriptionOfAllMethods {
    public static void main(String[] args) {
        String regexStr = "......";
        String inputStr = "......";
        String replaceStr = "Test";

        //Step-1 :compile
        Pattern pattern = Pattern.compile(regexStr);
        //Step-2 : matcher
        Matcher matcher = pattern.matcher(inputStr);
        //Perform matching operations
        matcher.find(); //finds the sequence
        matcher.matches(); //attempts to match the entire input sequence
        matcher.lookingAt(); //attempts to match the input sequence, starting at the beginning, against the pattern
        matcher.replaceAll(replaceStr); //Find and replace all matches
        matcher.replaceFirst(replaceStr);

        //Processing matching result
        matcher.group();
        matcher.start();
        matcher.end();
    }


}
