package com.shetu.tacocloud.temporary.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindAndReplaceWithBackReferences {
    public static void main(String[] args) {
        //inputString
        String inputString = "One:two:three:four";
        //regExpString
        String regExpString = "(.+):(.+):(.+):(.+)";
        //replacementString
        String replacementString = "$4-$3-$2-$1";
        //compile(),matcher()
        Pattern pattern = Pattern.compile(regExpString);
        Matcher matcher = pattern.matcher(inputString);
        ///replaceAll()
        String output = matcher.replaceAll(replacementString);
        System.out.println(output);

        ///using find()
        while(matcher.find()){
            System.out.println("find() found substring "+matcher.group()+
            " starting at index");
        }
    }
}
