package Arrays;
// find the minimum product of any two different elements in the array.

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
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] < max2 && max1 != arr[i]) {
                max2 = arr[i];

            }

        }
        System.err.println(max1 * max2);

    }

}
