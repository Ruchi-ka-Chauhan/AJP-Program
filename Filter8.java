package mse;

import java.util.Arrays;
import java.util.List;

public class Filter8  {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Python","","Java","","c++","","DBMS");
        list.stream().filter(s->!s.isEmpty()).forEach(System.out::println);
    }
}
