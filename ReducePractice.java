
import java.util.*;
public class ReducePractice {
    public static void main(String[] args) {
//List<Integer> list= Arrays.asList(103,56,42,45,66);
//list.stream().filter(n->n%2==0).forEach(System.out::println);
//        list.stream().filter(n->n >50).forEach(System.out::println);
//        List<String> list3=Arrays.asList("Aman","Abhay","Aoby");
//      list3.stream().filter(name->name.startsWith("A")).forEach(System.out::println);

        List<Integer> list= Arrays.asList(55,12,88,34,99,21);
        System.out.println(list);
        int result=list.stream().sorted((a,b)->b-a).toList().get(-1);
        System.out.println(result);
    }
}
