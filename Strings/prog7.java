package Strings;
// First Non-Repeating Character in a String

import java.util.HashMap;

// Input:  "aabbbcde"
// Output: c

// Input:  "swiss"
// Output: w

// Input:  "aabb"
// Output: -1

public class prog7 {
    public static void main(String[] args) {
        String s = "swiss";
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        boolean found = false;
        for (int j = 0; j < s.length(); j++) {
            if (hm.get(s.charAt(j)) == 1) {
                System.out.print(s.charAt(j));
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.print(-1);

        }
    }

}
