package mse;

import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;


public class Questin2 {
    public static void main(String[] args) {
        List<String> Name= Arrays.asList("JAVA","PYTHON","C");


        List<Character> result =Name.stream()
                .map(s -> s.charAt(0))
                .collect(Collectors.toList());

        List<String> result1 = Name.stream()
                .map(string -> "Item-" + string)
                .collect(Collectors.toList());

        List<Integer> result2 = Name.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }
}
