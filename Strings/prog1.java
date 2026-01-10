package Strings;

import java.util.*;

//reversing a string
public class prog1 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        String s = "Hello";
        // char s_arr[] = s.toCharArray();
        // for (int i = 0; i < s_arr.length; i++) {
        // int start = 0;
        // int end = s_arr.length - 1;
        // char temp = s_arr[start];
        // s_arr[start] = s_arr[end];
        // s_arr[end] = temp;
        // start++;
        // end--;

        // }
        // System.out.println(new String(s_arr));

        // method 2
        // String rev = "";
        // for (int i = s.length(); i >= 0; i--) {
        // rev += s.charAt(i);

        // }

        // method 3
        String rev = new StringBuilder(s).reverse().toString();

        System.out.print(rev);
    }

}
