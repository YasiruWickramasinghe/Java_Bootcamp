package _1_Basic._7_FunctionVsMethod;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Example String Change
        String name = "yasiru";
        changeName(name);
        System.out.println(name);

        //Example Integer Change
        int a = 10;
        int b = 20;
        swapNumber(a,b);
        System.out.println("a value: " + a + " b value: " + b);

        //Example Array Change
        int[] arr = {1,85,4,9,54,35,4,12};
        System.out.println("before change: " + Arrays.toString(arr));
        changeArray(arr);
        System.out.println("after change: " + Arrays.toString(arr)); // here change the value in index 0
    }

    private static void changeName(String naam) {
        naam = "sajith"; // not change because create new object
                         //string are cannot change they final class, immutable
    }

    private static void swapNumber(int num1, int num2) {
        int temp = num1;
        num1 = num2;           //no change, no swap here
        num2 = temp;
    }

    private static void changeArray(int[] nums) {
        nums[0] = 99;
    }

}
