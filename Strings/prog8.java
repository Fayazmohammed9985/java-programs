package Strings;
// Check if Rearranging Characters Can Form a Palindrome

// Input: "aab"
// Output: true
// Explanation: "aba" is a palindrome.

// Input: "abc"
// Output: false

// Input: "aabb"
// Output: true
// Explanation: "abba" is a palindrome.
import java.util.*;

public class prog8 {
    public static boolean isPalidrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (int num : hm.values()) {
            if (num % 2 != 0)
                count++;
        }
        if (count <= 1) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String s = "aab";
        System.out.print(isPalidrome(s));
    }
}