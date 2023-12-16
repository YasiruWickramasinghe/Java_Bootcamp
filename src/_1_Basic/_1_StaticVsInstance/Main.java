package Basic._1_StaticVsInstance;

class Vehicle {
    String brand = null;
    String name = null;
    int price = 0;

    // Static method
    public static void detailsStatic(String b, String n, int p) {
        System.out.println("Static method - vehicle brand is: " + b);
        System.out.println("Static method - vehicle name is: " + n);
        System.out.println("Static method - vehicle price is: " + p);
    }

    // Non-static method
    public void detailsNonStatic() {
        System.out.println("Non-static method - vehicle brand is: " + brand);
        System.out.println("Non-static method - vehicle name is: " + name);
        System.out.println("Non-static method - vehicle price is: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a new instance of the StaticVsInstance.Vehicle class
        Vehicle v1 = new Vehicle();

        // Set values for the instance variables (brand, name, price)
        v1.brand = "Toyota";
        v1.name = "Camry";
        v1.price = 5500;

        // Call the non-static method using an instance of the class
        v1.detailsNonStatic();
        System.out.println();

        // Call the static method using the class name
        Vehicle.detailsStatic("toyota", "civic", 540000);
    }
}
