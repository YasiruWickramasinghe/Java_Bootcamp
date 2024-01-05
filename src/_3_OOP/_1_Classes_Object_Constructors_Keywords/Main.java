package _3_OOP._1_Classes_Object_Constructors_Keywords;

public class Main {
    public static void main(String[] args) {
        //store 5 roll number
        int[] numbers = new int[5];

        //store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rollNo = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        //by default its null 5 object
        //System.out.println(Arrays.toString(students));

        //just declaring
        //Student yasiru;
        //yasiru = new Student();

        Student yasiru = new Student(13,"kunal kushwaha", 98.5f);
        Student sajith = new Student();
        //System.out.println(yasiru); //@65ab7765
        //ystem.out.println(yasiru.rollNo); //0
        //System.out.println(yasiru.name); //null
        //System.out.println(yasiru.marks); // 97.8

        //yasiru.rollNo = 1;
        //yasiru.name = "Yasiru Sajith";
        //yasiru.marks = 97.8f;

//        System.out.println(yasiru); // @65ab7765
//        System.out.println(yasiru.rollNo); // 1
//        System.out.println(yasiru.name); // Yasiru Sajith
//        System.out.println(yasiru.marks); // 97.8

        //yasiru.greeting();
        //yasiru.changeName("Muthu");
        //yasiru.greeting();

        //here this randome object all variblke replace with yasiru's object values
//        Student random = new Student(yasiru);
//        System.out.println(random.name);

        Student one = new Student();
        Student two = one;

        one.name = "something some";

        System.out.println(two.name); // Yasiru Sajith

    }

    //create a class
    static class Student {
        int rollNo;
        String name;
        float marks = 99.5f;

        void greeting(){
            System.out.println("Hello! my name is " + name);
        }

        void changeName(String name){
            this.name = name;
        }

        //constructor
        Student(){
            this.rollNo = 1;
            this.name = "Yasiru Sajith";
            this.marks = 97.8f;
        }

        //constructor overloading
        Student(int rno, String name, float marks){
            this.rollNo = rno;
            this.name = name;
            this.marks = marks;
        }

        //this constructor takes value from another object
        Student (Student other){
            this.rollNo = other.rollNo;
            this.name = other.name;
            this.marks = other.marks;
        }
    }
}
