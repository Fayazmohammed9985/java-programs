package Strings;
// Maximum Frequency Difference in a String

import java.util.HashMap;
import java.util.Scanner;

// Input:  "aabbbc"
// Frequencies:
// a → 2
// b → 3
// c → 1

// Output: 3 − 1 = 2

// Input:  "aaaa"
// Output: 0

public class prog13 {
    public static int difference(String s) {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int res = difference(s);
        System.out.println(res);
    }

}
