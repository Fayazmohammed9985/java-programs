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
        // int n = arr.length;
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // int d1 = distinctCount(arr[j]);
        // int d2 = distinctCount(arr[j + 1]);
        // if (d1 > d2) {
        // String temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        List<String> list = Arrays.asList(arr);

        Collections.sort(list, (s1, s2) -> {
            int d1 = distinctCount(s1);
            int d2 = distinctCount(s2);
            return d1 - d2;
        });
        for (String s : list) {
            System.out.print(s + " ");
        }
    }
}
