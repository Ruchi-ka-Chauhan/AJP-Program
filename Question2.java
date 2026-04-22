package mse;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class Question2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,34,56,78);

        List<String> result =list.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.println(result);



    }
}
