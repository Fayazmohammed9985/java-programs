package Strings;

//pallindrome
public class prog2 {
    public static void main(String args[]) {
        String s = "Hello";
        String rev = new StringBuilder(s).reverse().toString();
        if (s.equals(rev)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not a Pallindrome");
        }

    }
}
