package _3_OOP._2_Packages_Static_SingletonClass_InBuiltMethods._3_Singleton;

public class Main {
    public static void main(String[] args) {
        //first time this create a instance, because no instance created yet
        Singleton obj = Singleton.getInstance();

        //in this stage, object already created previos one, therefore return the previos instance
        Singleton obj1 = Singleton.getInstance();

        //same as above
        Singleton obj2 = Singleton.getInstance();

        //All three reference variable are pointing to just one object

    }
}
