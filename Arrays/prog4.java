package Arrays;
// find the maximum product of any two different elements in the array.

import java.util.Scanner;

// Input:  [1, 2, 3, 4]
// Output: 12
// Explanation: 3 × 4
import java.util.*;

public class prog4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && max1 != arr[i]) {
                max2 = arr[i];

            }

        }
        System.err.println(max1 * max2);

    }

}
