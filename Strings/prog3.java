package Strings;
//Anagram

//Input
// listen
// silent

//output
//yes
import java.util.*;

public class prog3 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("Yes-Anagram");
        } else {
            System.out.println("No,it is not an Anagram");
        }

    }
}
