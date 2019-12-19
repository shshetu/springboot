package com.shetu.tacocloud.temporary.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPattern {
    public static void main(String[] args) {
        //regexp String : compile it!
      String regexString = "\\b[1-9][0-9]+\\b";
//        String regexString = "\\w+";
        Pattern pattern = Pattern.compile(regexString);

        //input String : match it!
        String inputString = "This is an apple. These are 33 (thirty-three) apples.";
        Matcher matcher = pattern.matcher(inputString);

        //matches() method
        while(matcher.find()){
            System.out.println("find() found substring \""+matcher.group()
                    +"\" at starting index: "+matcher.start()
                    +" and ending at index:"+matcher.end());
        }
    }
}
