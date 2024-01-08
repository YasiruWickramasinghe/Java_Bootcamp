package _3_OOP._3_Inheritance_Polymorphism_Encapsulation_Abstraction._2_Polymorphism._2_Overriding;

public class Circle extends Shapes{

    // this will run when obj of Circle is created
    // hence it is overriding the parent method
    @Override // this is called annotation
    void area() {
        System.out.println("Area is pi * r * r");
    }
}
