package mse;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,204,56,78,90);
        Optional<Integer> max=list.stream().reduce((a,b)->a>b?a:b);
        System.out.println(max);
        Optional<Integer> min=list.stream().reduce((a,b)->a<b?a:b);
        System.out.println(min.get());
    }
}
