package Strings;

public class prog15 {
    public static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return isPalindrome(s, l + 1, r) ||
                        isPalindrome(s, l, r - 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = { "abca", "racecar", "abc", "deeee" };
        int count = 0;
        for (String s : arr) {
            if (validPalindrome(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
