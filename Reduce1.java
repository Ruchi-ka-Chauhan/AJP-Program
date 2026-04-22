package mse;

import java.util.Arrays;
import java.util.List;

public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40);
        int sum=list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Sum="+sum);
    }
}
