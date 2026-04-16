package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question14 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java","C++","API","Python");

        List<String> result=list.stream().map(String->String +"-"+String.length()).collect(Collectors.toList());
System.out.println(result);
    }
}
