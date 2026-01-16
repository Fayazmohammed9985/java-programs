// Factor Finder:
// Write a program to find the factors of a given number. If the input provided is negative,
// ignore the sign and provide the output. If the input is zero, the output should be "No
// Factors."
// Approach: Take an integer input from the user. If the number is zero, display "No
// Factors." If negative, ignore the sign by taking the absolute value. Then, find and print all
// numbers that divide the given number exactly without a remainder

// Input
// 12

// Output
// 1 2 3 4 6 12

public class p3 {
    public static void main(String[] args) {
        int num = -10;
        if (num == 0) {
            System.out.println("No Factor");
        }
        num = Math.abs(num);
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

}
