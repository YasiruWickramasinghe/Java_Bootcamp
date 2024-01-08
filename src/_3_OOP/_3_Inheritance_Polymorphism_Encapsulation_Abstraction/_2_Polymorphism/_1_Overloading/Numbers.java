package _3_OOP._3_Inheritance_Polymorphism_Encapsulation_Abstraction._2_Polymorphism._1_Overloading;

public class Numbers {

    double sum(double a, int b) {
        return a + b;
    }

    double sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();

        obj.sum(2, 3);
        obj.sum(1, 3, 7);

//        obj.sum(4, 5, 6, 8); // in compile time this error identify
    }
}
