
package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mappractice {
    public static void main(String args[]){
        List<String> Name= Arrays.asList("ankit","rijan","kavi");

        List<String> result=Name.stream().map(String::toUpperCase).collect(Collectors.toList());
         System.out.println(result);
    }
}
