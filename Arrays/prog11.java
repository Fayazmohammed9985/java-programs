package Arrays;
// Find the length of the longest prefix of the array such that the digit sums are strictly increasing.

import java.util.*;

// Input:
// [5, 14, 23, 41]
// Output:
// 1

// Input:
// [10, 11, 20, 32]

// Output:
// 2

public class prog11 {
    public static int count_digsum(int[] arr) {
        int count = 0;
        int digsum = -1;
        for (int x : arr) {
            int sum = 0;
            int temp = x;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            if (sum > digsum) {
                digsum = sum;
                count++;
            } else {
                break;
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
        int res = count_digsum(arr);
        System.out.println(res);
    }

}
