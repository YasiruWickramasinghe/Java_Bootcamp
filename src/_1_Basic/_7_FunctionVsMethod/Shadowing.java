package _1_Basic._7_FunctionVsMethod;

public class Shadowing {
    //class level variable, instance level variable
    static int x = 99; // this will be shadowed in line 7 and 8 print it
    public static void main(String[] args) {
        System.out.println("main: " + x);
        //local variable
        int x; //the class varible at line 4 is shadowed by this
        // System.out.println(x); // scope will begin when value is initialized
        x = 40;
        System.out.println("shadow the instance value and print:" + x);
        fun();
    }

    static void fun(){
        System.out.println("fun: " + x);
    }
}
