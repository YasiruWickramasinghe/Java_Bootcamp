package _3_OOP._5_AbstractClasses_Interfaces_Annotations._1_Abstract;

public class Son extends Parent {

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper Potts");
    }
}
