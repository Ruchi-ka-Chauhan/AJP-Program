import java.util.Comparator;

public class Cnvert2 {
    public static void main(String[] args) {
//        Comparator<Integer>comp=new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return a-b;
//            }
//        }
        Comparator<Integer>comp=(Integer a,Integer b)->a-b;
    }
}
