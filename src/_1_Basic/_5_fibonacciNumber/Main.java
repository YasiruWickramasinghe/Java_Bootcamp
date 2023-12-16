package _1_Basic._5_fibonacciNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter the Number: ");

        // Reading the user input as an integer
        int num = sc.nextInt();

        // Initializing the first two Fibonacci numbers
        int num1 = 0;
        int num2 = 1;

        // Initializing the count of Fibonacci numbers generated
        int count = 2;

        // Using a loop to generate Fibonacci numbers up to the specified count
        while (count <= num) {
            // Temporary variable to store num2 for swapping
            int temp = num2;

            // Calculating the next Fibonacci number
            num2 = num1 + num2;

            // Updating num1 with the previous num2
            num1 = temp;

            // Incrementing the count
            count++;
        }

        // Displaying the generated Fibonacci number
        System.out.println("The Fibonacci number at position " + num + " is: " + num2);
    }
}
