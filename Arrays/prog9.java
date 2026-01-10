package Arrays;
// Rotate the Array to the Right by K Positions

import java.util.Scanner;

// Input:
// 5
// 1 2 3 4 5
// 2

// Output:
// 4 5 1 2 3

public class prog9 {
    public static int[] rotated_array(int[] arr, int k) {
        int size = arr.length;
        k = k % size;
        rev_array(arr, 0, size - 1);
        rev_array(arr, 0, k - 1);
        rev_array(arr, k, size - 1);
        return arr;
    }

    static void rev_array(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res[] = rotated_array(arr, k);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }
}
