package Arrays;
//Find the Majority Element

import java.util.Scanner;

// You are given an integer array arr of size N.
// An element is called a majority element if it appears more than N / 2 times.

// Input:
// 7
// 2 2 1 2 3 2 2

// Output:
// 2

// Input:
// 5
// -1 -1 -1 2 3

// Output:
// -1

public class prog10 {
    public static int maj_ele(int[] arr) {
        // for (int i = 0; i < arr.length; i++) {
        // int count = 0;
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[i] == arr[j]) {
        // count++;
        // }
        // }
        // if (count > arr.length / 2) {
        // return arr[i];

        // }
        // }
        int maj = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                maj = arr[i];
                count = 1;
            } else if (arr[i] == maj) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int a = 0; a < arr.length; a++) {
            if (arr[a] == maj) {
                count++;
            }
        }

        return count > arr.length / 2 ? maj : -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = maj_ele(arr);
        System.out.println(res);
    }
}
