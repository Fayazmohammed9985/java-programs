package Strings;
// Count Strings Where Consonant Count Is a Prime Number

import java.util.Scanner;

// Input:
// ["hello", "bcdf", "aeiou", "strength"]

// Output:
// 2

// Input:
// ["abc", "bcd", "pqrs"]
// Output:
// 2

public class prog10 {
    public static int countmethod(String[] s) {
        int count = 0;
        for (String word : s) {
            int conscount = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isLetter(ch) && !"AEIOUaeiou".contains(String.valueOf(ch))) {
                    conscount++;
                }
            }
            int factors = 0;
            for (int j = 1; j <= conscount; j++) {
                if (conscount % j == 0) {
                    factors++;
                }
            }
            if (factors == 2) {
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
        int res = countmethod(s);
        System.out.println(res);
    }

}
