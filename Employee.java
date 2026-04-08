import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//import static java.lang.StringUTF16.charAt;

public class Employee {
    public static void main(String[] args) {
        List<String> language= Arrays.asList("java","Python","c++");
        ArrayList<String>list=new ArrayList<String>();
        list.addAll(language);
        System.out.println(language);
        List<Integer> hashList=list.stream().map(lan->lan.hashCode()).toList();
        System.out.println(hashList);
      //  list.stream().filter((name)->name(charAt())).forEach((value)->System.out.println(value+" "));
    }
}
