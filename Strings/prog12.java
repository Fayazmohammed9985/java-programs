package Strings;
// Validate Parentheses String With One Allowed Mismatch

import java.util.Scanner;

// Input: "()())"
// Output: true

// Input: "())("
// Output: false

public class prog12 {
    public static boolean valid(String s) {
        int count = 0;
        int one_chance = 1;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            if (count < 0 && one_chance == 1) {
                count++;
                one_chance = 0;

            } else if (count < 0 && one_chance == 0) {
                return false;
            }

        }
        return (count == 0 || count == 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean res = valid(s);
        System.out.println(res);
    }
}
