package _3_OOP._2_Packages_Static_SingletonClass_InBuiltMethods._2_Static;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    static void message(){
        System.out.println("Hello world");

        //cannot use this keyword inside static method, because "this" keyword represent the current object
        //System.out.println(this.age);
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;

        //static variable access using class name
        Human.population += 1;

        //static method
        Human.message();
    }
}
