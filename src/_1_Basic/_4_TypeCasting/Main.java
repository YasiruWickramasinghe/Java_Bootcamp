package _1_Basic._4_TypeCasting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Implicit casting (widening)
        // Implicit casting occurs when you convert a data type to another data type that has a larger range or precision.
        // Java automatically performs this type of casting without any explicit instructions.
        int intValue = 100;
        long longValue = intValue; // No explicit casting needed

        // Explicit casting (narrowing)
        // Explicit casting is required when you convert a data type to another data type that has a smaller range or precision.
        // This type of casting requires a manual intervention, and there is a risk of losing data if the conversion is not handled carefully.
        double doubleValue = 123.45;
        int intValueFromDouble = (int) doubleValue; // Requires explicit casting

        System.out.println("Implicit Casting");
        System.out.println("intValue: " + intValue);
        System.out.println("longValue: " + longValue);
        System.out.println();
        System.out.println("Explicit Casting");
        System.out.println("doubleValue: " + doubleValue);
        System.out.println("intValueFromDouble: " + intValueFromDouble);
    }
}
