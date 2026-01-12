package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

// Remove Duplicate Characters to Form the Lexicographically Smallest String
// Input:  "bcabc"
// Output: "abc"

// Explanation:
// Remove duplicates
// Smallest lexicographical order → "abc"

// Input:  "cbacdcbc"
// Output: "acdb"

public class prog11 {
    public static String smallstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashSet<Character> finalstring = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            hm.put(c, hm.get(c) - 1);
            if (finalstring.contains(c))
                continue;
            while (!stack.isEmpty() && stack.peek() > c && hm.get(stack.peek()) > 0) {
                finalstring.remove(stack.pop());
            }
            stack.push(c);
            finalstring.add(c);

        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "cbacdcbc";
        String res = smallstring(s);
        System.out.println(res);
    }

}
