package _3_OOP._1_Classes_Object_Constructors_Keywords;

public class WrapperExample {
    public static void main(String[] args) {
        //this is primitive types
//        int a = 10;
//        int b = 20;

        //this is type of object, here we can find many functions like num.byteValue();
        Integer num = 45;
        //num.byteValue();

        //swap(a,b);

        Integer a = 10;
        Integer b = 20;

        swapWarapper(a,b);
        System.out.println(a + " " + b);

        //final int bonus = 2;
        //cannot be modify
        //bonus = 3;
    }

    //this will not swapping
//    static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    //this also not work because Wrapper class are final classes
        static void swapWarapper(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A{
    //final variable must be initialized
    //final int num;
}
