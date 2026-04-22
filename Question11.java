package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(22,45,67);

        List<Integer> result=list.stream().map(c -> (c * 9/5) + 32).collect(Collectors.toList());
   System.out.println(result);
    }
}

