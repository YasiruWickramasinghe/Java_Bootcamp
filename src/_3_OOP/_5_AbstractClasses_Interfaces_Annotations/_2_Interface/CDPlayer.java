package _3_OOP._5_AbstractClasses_Interfaces_Annotations._2_Interface;

public class CDPlayer implements Media{

    @Override
    public void start() {
        System.out.println("Music start");
    }

    @Override
    public void stop() {
        System.out.println("Music stop");
    }
}
