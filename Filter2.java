package mse;

import java.util.Arrays;
import java.util.List;


public class Filter2 {
    public static void main(String[] args) {


    List<String> list= Arrays.asList("Ja","Aki","Harsh","Annu","Sakshi","Ruchika");
  // list.stream().filter(s->s.startsWith("A")).forEach(System.out::println);
   list.stream().filter(s->s.length()>3).forEach(System.out::println);
}
}