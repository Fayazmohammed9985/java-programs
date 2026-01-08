package Arrays;
//  Check if Sum of Even-Indexed Elements > Sum of Odd-Indexed Elements

// Input: [1, 2, 3, 4, 5]
// Even indices → arr[0] + arr[2] + arr[4] = 1 + 3 + 5 = 9
// Odd indices → arr[1] + arr[3] = 2 + 4 = 6
// Output: true
import java.util.*;

class prog1 {

    public static boolean result(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum1 += arr[i];
            } else {
                sum2 += arr[i];
            }
        }
        return sum1 > sum2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean res = result(arr);
        System.out.println(res);

    }
}
