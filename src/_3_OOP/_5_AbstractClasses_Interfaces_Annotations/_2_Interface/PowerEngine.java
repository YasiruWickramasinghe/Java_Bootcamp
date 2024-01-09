package _3_OOP._5_AbstractClasses_Interfaces_Annotations._2_Interface;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Power engine start");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stop");
    }

    @Override
    public void acc() {
        System.out.println("Power engine accelerate");
    }
}
