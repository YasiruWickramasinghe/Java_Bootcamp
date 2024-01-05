package _3_OOP._2_Packages_Static_SingletonClass_InBuiltMethods._3_Singleton;

public class Singleton {
    // updating Constructor method as private, peoples cannot access constructor,
    // therefore we cant create new object, because to create new object we need Constructor

    private Singleton(){

    }

    //create one instance
    private static Singleton instance;

    public static Singleton getInstance(){
        //check whether one object only created or not
        if(instance == null){
            instance = new Singleton();
        }

        //return the one we have created
        return instance;
    }
}
