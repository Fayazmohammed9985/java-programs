package Arrays;
// Count Numbers Whose Reversed Value Is Also Present in the Array

import java.util.HashSet;
import java.util.Scanner;

// Reverse should ignore leading zeros
// 120 → 21

// Negative numbers:
// Reverse the absolute value
// Keep the sign
// -123 → -321

// Input 1:
// [12, 21, 34, 43, 10]
// Output:
// 4

// Input 2:
// [10, 1, 20, 2]
// Output:
// 4

public class prog12 {
    public static int count_pairs(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : arr) {
            set.add(ele);
        }
        int count = 0;
        for (int x : arr) {
            int rev = 0;
            int temp = Math.abs(x);
            while (temp > 0) {
                int d = temp % 10;
                rev = rev * 10 + d;
                temp = temp / 10;
            }
            if (x < 0) {
                rev = -1 * rev;
            }
            if (set.contains(rev)) {
                count++;

            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = count_pairs(arr);
        System.out.println(res);
    }
}
