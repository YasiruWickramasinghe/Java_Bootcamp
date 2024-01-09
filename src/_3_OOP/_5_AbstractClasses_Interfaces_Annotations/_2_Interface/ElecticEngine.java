package _3_OOP._5_AbstractClasses_Interfaces_Annotations._2_Interface;

public class ElecticEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric engine start");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Electric engine accelerate");
    }
}
