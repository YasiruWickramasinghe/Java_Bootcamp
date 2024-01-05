package _3_OOP._2_Packages_Static_SingletonClass_InBuiltMethods._2_Static;

public class Main {
    public static void main(String[] args) {
        Human yasiru = new Human(26,"Yasiru Wickramasinghe", 15000, false);
        Human muthu = new Human(24,"Muthu Wijenayake", 15000, false);

        System.out.println(yasiru.name);

        //static variable access using class name
        System.out.println(Human.population);
        System.out.println(Human.population);

        //greeting();
    }

    // we cannot use non-static method inside static method
    // we can use static method inside non-static method

    static void fun3(){
        //this cannot use because, before calling this method that greeting function should be created new instance
        //greeting();
    }

    //this is not dependent on object
    static void fun(){
        // we cannot use non-static method inside static method
        //greeting();

        // we can use non-static method inside static method using creating instance of the class
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        //this can use because, before calling that method that greeting function calls via static method
        greeting();
    }

    //this belongs to an object
    void greeting(){
        fun(); // we can use static method inside non-static method
        System.out.println("Hello world");
    }
}
