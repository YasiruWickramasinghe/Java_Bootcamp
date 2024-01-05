package _3_OOP._2_Packages_Static_SingletonClass_InBuiltMethods._2_Static;

//this will work outside of class
//class Test {
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }
//}

public class InnerClasses {
    //here this Test class depend on InnerClasses, therefore we can't use
    //if you need to access Test class
    //it should be Static type like below
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("kunal");
        Test b = new Test("rahul");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
