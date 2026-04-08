import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,12,6,67,89,43); //(0index -min)  (max n-1).............(min is terminal operation)
        Optional<Integer> result=list.stream().min((a, b)->a-b);  //a-b asscending b-a :descending
        result.ifPresent(System.out::println);
    }
}
//having comaparator as parameter on a basis of comaprator