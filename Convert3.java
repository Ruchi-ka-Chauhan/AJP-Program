import java.util.concurrent.Callable;

public class Convert3 {
    public static void main(String[] args) {
//        Callable<Integer> c = new Callable<Integer>() {
//            @Override
//            public Integer call() {
//                return 100;
//            }
//        };
        Callable<Integer> c =()->100;
    }
}
