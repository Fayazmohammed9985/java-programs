package Strings;

import java.util.*;

// find the maximum difference between the frequency of any two characters in the string.
// Input:  "aabbbc"
// Frequencies:
// a → 2
// b → 3
// c → 1

// Output: 3 − 1 = 2

public class prog5 {
    public static int difference(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);

        }
        int maxe = Collections.max(hm.values());
        int mine = Collections.min(hm.values());
        return maxe - mine;

    }

    public static void main(String[] args) {
        String s = "aabbbc";
        int res = difference(s);
        System.out.println(res);
    }
}
