package _3_OOP._2_Packages_Static_SingletonClass_InBuiltMethods._2_Static;

//this is demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    //will only run once, when the first obj is create i.e. when the class is loaded for first time
    static{
        System.out.println("I am in Static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a +  " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a +  " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a +  " " + StaticBlock.b);
    }
}
