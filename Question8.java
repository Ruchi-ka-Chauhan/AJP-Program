package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question8 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java","Python","C++");

        List<String> result= list.stream().map(String::trim).collect(Collectors.toList());
        System.out.println(result);
    }
}
