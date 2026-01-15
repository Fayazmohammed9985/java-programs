package Strings;

// Longest Balanced Substring of 0s and 1s
import java.util.HashMap;

public class prog14 {

    public static int longestBalanced(String s) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        hm.put(0, -1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '0') {
                sum -= 1;
            } else {
                sum += 1;
            }
            if (hm.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - hm.get(sum));
            } else {
                hm.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "00110";
        System.out.println(longestBalanced(s));
    }
}
