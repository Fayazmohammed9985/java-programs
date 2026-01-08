package Arrays;
// Count Pairs Whose XOR Is Even

import java.util.Scanner;

// Input:  [1, 2, 3, 4]
// Pairs:
// (1,3) → odd ^ odd = even
// (2,4) → even ^ even = even

// Output: 2

public class prog3 {
    public static int result(int[] arr) {
        int ce = 0;
        int co = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                ce += 1;
            } else {
                co += 1;
            }
        }
        int evpairs = ce * (ce - 1) / 2;
        int odpairs = co * (co - 1) / 2;

        return evpairs + odpairs;
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
