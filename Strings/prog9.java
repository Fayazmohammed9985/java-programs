package Strings;
// Longest Substring Containing Only Consonants

// Input:  "bcdAEfg"
// Output: 3

// Explanation:
// "bcd" → 3
// "fg" → 2

public class prog9 {
    public static int countCons(String s) {
        int maxLength = 0;
        int currLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) && !"AEIOUaeiou".contains(String.valueOf(ch))) {
                currLength++;
            } else {
                currLength = 0;
            }
            maxLength = Math.max(currLength, maxLength);

        }
        return maxLength;

    }

    public static void main(String args[]) {
        String s = "bcdAEfg";
        int res = countCons(s);
        System.out.println(res);
    }

}
