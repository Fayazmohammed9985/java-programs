// Write a program to calculate the fuel consumption of a truck.

// The program should ask the user to enter:

// the quantity of diesel required to fill the tank, and

// the distance covered until the tank goes dry.

// The program must calculate and display the fuel consumption in the format liters per 100 kilometers.
// Then convert the same result to the U.S. style of miles per gallon and display it.

// If the quantity of diesel or the distance covered is zero or negative, display "Invalid Input".

// Input 1: A floating-point value representing the quantity of diesel (in liters)

// Input 2: A floating-point value representing the distance covered (in kilometers)

// Sample Input 1
// 20
// 150

// Sample Output 1
// 13.33
// 17.64
import java.util.*;

public class p2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diesel = sc.nextInt();
        double distance = sc.nextInt();
        double liters = 0;
        double us = 0;
        if (diesel <= 0 || distance <= 0) {
            System.out.print("Invalid Input");
        }
        liters = (diesel / distance) * 100;
        double gallons = diesel * 0.26;
        double miles = distance * 0.62;
        us = miles / gallons;

        System.out.println(liters);
        System.out.println(us);

    }
}