package Strings;
// Count Strings With Same First and Last Character

import java.util.Scanner;

// Input:
// ["abc", "aba", "a", "xyz", "aa"]

// Output:
// 3
public class prog4 {
    public static int countFandL(String[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            String a = s[i];
            if (a.charAt(0) == a.charAt(s[i].length() - 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextLine();
        }
        int res = countFandL(s);
        System.out.println(res);

    }
}
