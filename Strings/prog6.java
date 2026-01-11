package Strings;
// Count Strings With More Vowels Than Consonants

import java.util.Scanner;

// Input:
// ["hello", "aeiou", "bcdf", "education"]

// Output:
// 2

public class prog6 {
    String vowels = "AEIOUaeiou";

    public static int countmethod(String[] s) {
        int count = 0;
        String vowels = "AEIOUaeiou";
        for (String word : s) {
            int vowelcount = 0;
            int conscount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (vowels.contains(String.valueOf(word.charAt(i)))) {
                    vowelcount++;
                } else {
                    conscount++;
                }
            }
            if (vowelcount > conscount) {
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
