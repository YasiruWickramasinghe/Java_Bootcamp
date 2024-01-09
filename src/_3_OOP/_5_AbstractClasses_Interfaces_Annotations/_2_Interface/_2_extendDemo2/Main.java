package _3_OOP._5_AbstractClasses_Interfaces_Annotations._2_Interface._2_extendDemo2;

public class Main implements A, B {
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        Main obj = new Main();
        A.greeting();
    }
}
