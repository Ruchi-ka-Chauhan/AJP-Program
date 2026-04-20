package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter1 {
    public static void main(String[] args) {
List<Integer> even= Arrays.asList(23,24,25,26,27);
List<Integer> result= even.stream().filter(n->n%2==0).collect(Collectors.toList());
System.out.println(result );
    }
}

//import java.util.*;

//public class Filter1{

      //  public static void main(String[] args) {

//            List<Integer> list = Arrays.asList(10, 15, 20, 25, 30);
//
//            list.stream()
//                    .filter(n -> n % 2 == 0)
//                    .forEach(System.out::println);
//        }
//    }



