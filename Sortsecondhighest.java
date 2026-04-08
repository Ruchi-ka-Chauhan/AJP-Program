import java.util.Arrays;
import java.util.List;

public class Sortsecondhighest {
    public static void main(String[] args) {
//        List<Integer> list1= Arrays.asList(55,12,88,34,99,21);
//        System.out.println(list1);
////        int result=list1.stream().sorted((a,b)->b-a).toList().get(1);
//        int result=list1.stream().sorted((a,b)->b-a).skip(3).findFirst().get();
//        System.out.println(result);
        List<String> list=Arrays.asList("Suresh","Ajay","Neha","vikas","priya");
        System.out.println(list);
        List<String> sortedList=list.stream().sorted().toList();
        System.out.println(sortedList);
        //by length
        List<String> sortedList2=list.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(sortedList2);
    }
}
