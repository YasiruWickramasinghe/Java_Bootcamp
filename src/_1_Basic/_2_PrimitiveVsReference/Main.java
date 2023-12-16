package _1_Basic._2_PrimitiveVsReference;

public class Main {
    public static void main(String[] args) {
        // Primitive Data Types
        int primitiveInt1 = 10;
        int primitiveInt2 = primitiveInt1; // Value is copied

        System.out.println("Primitive Data Types:");
        System.out.println();
        System.out.println("primitiveInt1: " + primitiveInt1);
        System.out.println("primitiveInt2: " + primitiveInt2);
        System.out.println();

        primitiveInt1 = 20; // Changing the value of primitiveInt1 does not affect primitiveInt2

        System.out.println("Changing the value of primitiveInt1 does not affect primitiveInt2");
        System.out.println();
        System.out.println("primitiveInt1: " + primitiveInt1);
        System.out.println("primitiveInt2: " + primitiveInt2);
        System.out.println();

        // Reference Data Types
        int[] array1 = {1, 2, 3};
        int[] array2 = array1; // Reference is copied, not the values

        System.out.println("Reference Data Types:");
        System.out.println();
        System.out.println("array1: " + java.util.Arrays.toString(array1));
        System.out.println("array2: " + java.util.Arrays.toString(array2));
        System.out.println();

        array1[0] = 100; // Modifying the array1 also affects array2

        System.out.println("After Modifying the array1 also affects array2");
        System.out.println();
        System.out.println("array1: " + java.util.Arrays.toString(array1));
        System.out.println("array2: " + java.util.Arrays.toString(array2));
    }
}//
