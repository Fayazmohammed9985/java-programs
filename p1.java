// Maximum Number of People Using Lift Without Exceeding Capacity
// There is a lift in your society that can accommodate a maximum weight of X units.
// The weights of the people planning to use the lift are given in an integer array A of size N.
// Your task is to find and return an integer value representing the maximum number of people that can use the lift together without exceeding the lift’s weight capacity.

// input1: An integer N, representing the number of people
// input2: An integer X, representing the maximum weight capacity of the lift
// input3: An integer array A of size N, representing the weights of people

// input1 = 3
// input2 = 9
// input3 = {5, 1, 5}
// Output
// 2
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        int i1 = 3;
        int i2 = 9;
        int[] weights = { 5, 1, 5 };
        int count = 0;
        int sum = 0;
        Arrays.sort(weights);
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (sum <= i2) {
                count++;
            }
        }
        System.out.println(count);

    }

}
