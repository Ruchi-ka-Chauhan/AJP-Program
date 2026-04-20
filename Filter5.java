package mse;

import java.util.Arrays;
import java.util.List;

public class Filter5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,45,66,55,44,2234,5,898,65);
        list.stream().filter(s->s%2!=0).forEach(System.out::println);
        System.out.println("  ");
        list.stream().filter(s->s%5==0).forEach(System.out::println);


    }
}
