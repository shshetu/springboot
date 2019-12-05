package com.shetu.tacocloud.temporary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        /*Use of Map*/
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        /*Use of filter method*/
        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        /*Use of sorted method*/

        /*Use of forEach method*/

        /*Use of reduce method*/
    }

}
