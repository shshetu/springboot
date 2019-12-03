package com.example.unittest1.junitEx1;

import java.util.StringTokenizer;

public class Calculation {
    //method that returns maximum number
    public static int findMax(int arr[]){
        int max =Integer.MIN_VALUE;

        //find max
        for(int i =0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    //method that returns cube of the given number
    public static int cube(int n){
        return n*n*n;
    }

    //method that returns reverse words
    public static String reverseWord(String str){
        StringBuilder result = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(str,"");

        while (tokenizer.hasMoreTokens()){
            StringBuilder sb = new StringBuilder();
            sb.append(tokenizer.nextToken());
            sb.reverse();

            result.append(sb);
            result.append(" ");
        }
        return result.toString(); //converting the StringBuilder into String
    }


}
