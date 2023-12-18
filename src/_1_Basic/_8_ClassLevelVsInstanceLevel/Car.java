package _1_Basic._8_ClassLevelVsInstanceLevel;

public class Car {
    // Instance-level variables
    String model;
    int year;

    // Class-level (static) variable
    static int totalCarsSold = 0;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        // Increment the class-level variable each time a new Car object is created
        totalCarsSold++;
    }
}

class Main {
    public static void main(String[] args) {
        Car c1 = new Car("ferari",2015);
        Car c2 = new Car("lamborgini",2012);
        Car c3 = new Car("bugatti",2017);
        Car c4 = new Car("civic",2022);
        Car c5 = new Car("toyota",2010);

        System.out.println("Total car sold: " + Car.totalCarsSold);

    }
}
