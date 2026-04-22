package mse;

import java.util.Arrays;
import java.util.List;

public class Reduce2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,80,90);
       int product=list.stream().reduce(1,(a,b)->a*b);
       System.out.println("product ="+ product);
    }
}
