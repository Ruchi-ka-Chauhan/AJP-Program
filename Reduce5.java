package mse;

import java.util.Arrays;
import java.util.List;

public class Reduce5 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,34,99);
//        int sum=list.stream().filter(a->a%2==0).reduce(0,(a,b)->a+b);
//        System.out.println("sum="+sum);
        //int second=list.stream().sorted((a,b)->b-a).skip(1).findFirst().get();
//        int sum= list.stream().reduce(0,(a,b)->a+b);
//        double avg=(double)sum/list.size();
//        System.out.println(avg);
        int sum = list.stream()
                .map(x -> String.valueOf(x))
                .flatMap(x -> x.chars().mapToObj(c -> c - '0'))
                .reduce(0, (a, b) -> a + b);

        System.out.println(sum);

        // System.out.println(second);
       List<String> list1=Arrays.asList("java","python","sql");
//        String result=list.stream().reduce("",(a,b)->a+b+" ");
//        System.out.println(result);
        String longest=list1.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
        System.out.println(longest);

    }
}
