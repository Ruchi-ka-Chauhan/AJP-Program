package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question9 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("1","2","3 ");

        List<Integer> result=list.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(result);
    }
}
