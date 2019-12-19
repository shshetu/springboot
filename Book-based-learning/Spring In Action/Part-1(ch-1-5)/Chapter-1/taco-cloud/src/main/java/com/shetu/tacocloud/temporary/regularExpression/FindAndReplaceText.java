package com.shetu.tacocloud.temporary.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplaceText {
    public static void main(String[] args) {
        //regExpString,
        String regExpString = "apple";
        Pattern pattern = Pattern.compile(regExpString);
        //inputString
        String inputString  = "This is an apple. These are 33 (Thirty-three) apples";
        Matcher matcher = pattern.matcher(inputString);
        //replacementString
        String replacementString = "orange";
        //replaceFirst(replacementString)
        String outputString = matcher.replaceFirst(replacementString);
        System.out.println("Using replaceFirst():----");
        System.out.println(outputString);
        //replaceAll(replacementString)
        System.out.println(" Using replaceAll():---");
        outputString = matcher.replaceAll(replacementString);
        System.out.println(outputString);
    }
}
