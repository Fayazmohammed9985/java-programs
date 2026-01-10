package Arrays;
// find the product of two minimum  elements in the array.

// Input:  [-10, -3, 5, 6]
// Output: 30
// Explanation: -10 × -3 = 30

import java.util.Scanner;

public class prog5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min1) {
                min2 = min1;
                min1 = arr[i];
            } else if (arr[i] < min2 && min1 != arr[i]) {
                min2 = arr[i];

            }

        }
        System.err.println(min1 * min2);

    }

}
