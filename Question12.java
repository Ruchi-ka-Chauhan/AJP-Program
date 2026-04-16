package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question12 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java","Python","C++");

        List<Character> result=list.stream().map(s -> s.charAt(s.length() - 1)).collect(Collectors.toList());
        System.out.println(result);
    }
}
