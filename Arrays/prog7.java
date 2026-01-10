package Arrays;

import java.util.Scanner;

//find the second largest distinct element.
public class prog7 {

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
        if (max2 == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(max2);
        }

    }
}
