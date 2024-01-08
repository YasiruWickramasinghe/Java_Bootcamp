package _3_OOP._3_Inheritance_Polymorphism_Encapsulation_Abstraction._2_Polymorphism._2_Overriding;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        circle.area();
    }
}
