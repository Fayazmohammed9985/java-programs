package Arrays;
// Check if Any Two Numbers Sum Up to K

import java.util.HashSet;
import java.util.Scanner;

// Given:
// an integer array arr
// an integer K
// Return true if any two different elements in the array sum to K.
// Otherwise return false.

// Input:
// arr = [2, 7, 11, 15]
// K = 9

// Output: true
// Explanation: 2 + 7 = 9

public class prog2 {
    public static boolean result(int arr[], int k) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == k) {
        // return true;
        // }
        // }
        // }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int p = k - arr[i];
            if (set.contains(p)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        boolean res = result(arr, k);
        System.out.println(res);

    }
}
