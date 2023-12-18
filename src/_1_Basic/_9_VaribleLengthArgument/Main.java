package _1_Basic._9_VaribleLengthArgument;

public class Main {
    // Method with variable-length argument list
    public static int sum(int... numbers) {
        int result = 0;
        for (int num : numbers) {
            result += num;
        }
        return result;
    }

    public static void main(String[] args) {
        // Calling the method with different numbers of arguments
        int sum1 = sum(1, 2, 3, 4, 5);
        int sum2 = sum(10, 20, 30);
        int sum3 = sum(5, 10, 15, 20, 25, 30);

        // Displaying the results
        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Sum 3: " + sum3);
    }
}
