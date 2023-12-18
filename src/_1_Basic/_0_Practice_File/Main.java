package _1_Basic._0_Practice_File;

import java.util.Arrays;
import java.util.Scanner;


public class Main {



    public static void countNums(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int count = 0;
        while(num > 0){
            int rem = num % 10;

            if(rem == 3){
                count++;
            }

            num = num / 10;
        }

        System.out.println(count);
    }

    public static void reverseNums(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int res = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;

            res =  res * 10 + rem;
        }

        System.out.println(res);
    }

    public static boolean primeNumber(int number){

        //A prime number is a natural number greater than 1 that is not a product of two smaller natural numbers.
        //In other words, a prime number is a number greater than 1 that is divisible only by 1 and itself.

        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        // Check for factors from 2 to half of the number
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }

        return true; // If no factors found, it's a prime number
    }

    public static boolean armStrong(int number){

        //An Armstrong number (also known as a narcissistic number, pluperfect digital invariant, or pluperfect number)
        //is a number that is the sum of its own digits each raised to the power of the number of digits

        //example 1
            //a=153 then get 1*1*1 + 5*5*5 + 3*3*3
            //then get sum = 1 + 125 + 27
            //armStrong = 153

        //example 2
            //a=1634 then get 1*1*1*4 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4
            //then get sum = 1 + 1296 + 81 + 256
            //armStrong = 1634



        //path
        //1) break the number
        //2) if is has 3 number then get power of 3 for each number, if the number is 4 digit number then get power of  4 for each number
        //3) then check that sum is equal to original number

        int originalNumber = number;
        int sum = 0;
        while(number > 0){
            int remainder = number % 10;
            int cube = remainder * remainder * remainder;
            System.out.println("number " + remainder + " cube is " + cube );
            sum = sum + cube;
            number = number / 10;
        }

        if (sum == originalNumber){
            return true;
        }
        return false;
    }

    public static int maxValueInArray(int[] arr){

        int maxvalue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    public static int maxValueInArrayInRange(int[] arr, int start, int end){

        int maxvalue = arr[0];

        for (int i = start; i <= end; i++) {
            if(arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }

    public static void new1(){

        System.out.println("start in here");
    }

    public static void main(String[] args) {
        // 1) count number
            //countNums();

        // 2) reverse number
            //reverseNums();

        // 3) prime Number
            //Scanner sc = new Scanner(System.in);
            //System.out.print("Enter Number: ");
            //int number = sc.nextInt();
            //boolean ans = primeNumber(number);
            //System.out.println("prime number is: " + ans);

        // 4) print all the 3 digits armStrong Number
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter Number: ");
//            int number = sc.nextInt();
//            boolean ans = armStrong(number);
//            System.out.println("ArmStrong number is: " + ans);

        // 5) print maximum Value of Array
//            int[] arr = {1,7,5,4,9,3,5};
//            int maxValue = maxValueInArray(arr);
//            System.out.println("maximun value is: " + maxValue);

        // 6) print maximum Value of an Array in given Range
//            int[] arr = {1,7,54,4,9,13,5};
//            int start = 3;
//            int end = 6;
//            int maxValue = maxValueInArrayInRange(arr, start, end);
//            System.out.println("maximun value in range of (" +start+ " - " +end+ ") : " + maxValue);


        new1();
    }
}
