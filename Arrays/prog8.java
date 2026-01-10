package Arrays;
// You are given an integer array of size N.

import java.util.Scanner;

// A special subarray is defined as a contiguous subarray of size 3 such that the sum of the first and third elements is equal to the second element.
// Your task is to count the number of such special subarrays present in the given array.

//Input
// 5
// 1 2 1 3 2
//output:
//2

public class prog8 {
    public static int result(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] + arr[i + 2] == arr[i + 1]) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = result(arr);
        System.out.println(res);
    }
}
