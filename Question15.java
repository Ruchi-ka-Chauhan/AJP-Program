package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question15 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4);
        List<Boolean> result = list.stream()
                .map(n -> n % 2 == 0)
                .collect(Collectors.toList());

        //List<Boolean> result=list.stream().map(n->(n % 2==0).collect(Collectors.toList());
        System.out.println(result);
    }
}
