interface PString{
    boolean checkPalin(String info);
}

public class PalindromeMain {
    public static void main(String[] args) {

        PString ps=(String info)-> {
            return new StringBuilder(info).reverse().toString().equals(info);   //y StringBuilder?
        };
        if(ps.checkPalin("AcA")){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
