package _1_Basic._3_PrimitiveAndWrapper;

/**
 * Explanation:
     * Wrapper Classes: Integer, Double, Character, and Boolean.
     * Usage:
     * Autoboxing: Implicit conversion from primitive type to wrapper class.
     * Unboxing: Implicit conversion from wrapper class to primitive type.
     * Utility methods for additional operations, e.g., intValue(), toString().
 *
 * Why Use Wrapper Classes?
    *
     * Object Compatibility: When an object is required, such as in collections or generic classes,
     * wrapper classes allow primitive types to be used.
     *
     * Nullability: Wrapper classes can represent null values, which can be useful in scenarios where
     * an absence of value needs to be indicated.
     *
     * Utility Methods: Wrapper classes provide useful methods for various operations,
     * including conversion, parsing, and comparison.
     *
     * Collections Framework: Many classes in the Java Collections Framework require objects,
     * so wrapper classes are necessary when working with collections.
     *
     * Compatibility with APIs: Some APIs may expect or return objects, so using wrapper classes ensures compatibility.
     *
     * In summary, wrapper classes provide a way to work with primitive types in object-oriented contexts,
     * and they offer additional functionality that can be useful in various scenarios.
     * Autoboxing and unboxing make the transition between primitive types and wrapper classes seamless.
 */

public class Main {
    public static void main(String[] args) {
        // Primitive Types
        int primitiveInt = 42;
        double primitiveDouble = 3.14;
        char primitiveChar = 'A';
        boolean primitiveBoolean = true;

        System.out.println("Primitive Types:");
        System.out.println("int: " + primitiveInt);
        System.out.println("double: " + primitiveDouble);
        System.out.println("char: " + primitiveChar);
        System.out.println("boolean: " + primitiveBoolean);

        System.out.println();

        // Wrapper Classes
        Integer wrapperInt = 42; // Autoboxing: int to Integer
        Double wrapperDouble = 3.14;
        Character wrapperChar = 'A';
        Boolean wrapperBoolean = true;

        System.out.println("Wrapper Classes:");
        System.out.println("Integer: " + wrapperInt);
        System.out.println("Double: " + wrapperDouble);
        System.out.println("Character: " + wrapperChar);
        System.out.println("Boolean: " + wrapperBoolean);

        // Using utility methods
        int intValue = wrapperInt.intValue(); // Unboxing: Integer to int
        System.out.println("Unboxed int value: " + intValue);

        String strValue = wrapperInt.toString(); // Convert Integer to String
        System.out.println("Converted to String: " + strValue);
    }
}
