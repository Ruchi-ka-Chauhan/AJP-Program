public class Convert {
    public static void main(String[] args) {
//        Runnable r =new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Running thread");
//            }
//        };
        Runnable r = () ->
            System.out.println("Running Thread");

    }
}
