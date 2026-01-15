package Strings;

import java.util.*;

public class prog16 {

    public static int distinctCount(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] arr = { "abc", "aa", "ab", "aabbcc" };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int d1 = distinctCount(arr[i]);
            int d2 = distinctCount(arr[i + 1]);
            if (d1 > d2) {
                String temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
