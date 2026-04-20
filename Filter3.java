package mse;

import java.util.Arrays;
import java.util.List;

public class Filter3 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,56,45,67,89,76,87,10,7,50);
        list.stream().filter(s->s>=50).forEach(System.out::println);
    }
}
