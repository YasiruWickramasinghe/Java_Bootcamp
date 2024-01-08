package _3_OOP._3_Inheritance_Polymorphism_Encapsulation_Abstraction._1_Inheritance;

public class Main {
    public static void main(String[] args) {
//        //Box box = new Box();
//        //Box box = new Box(4);
//        Box box1 = new Box(4.6, 7.9,9.9);
//        Box box2 = new Box(box1);
//
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,3,4,8);
        System.out.println(box3.h + " " + box3.weight);
    }
}
