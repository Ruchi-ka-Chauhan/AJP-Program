package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question13 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Java","C++","AI");

//       Hashcode
        List<Integer> result=list.stream().map(String::hashCode).collect(Collectors.toList());
          System.out.println(result);
    }
}
