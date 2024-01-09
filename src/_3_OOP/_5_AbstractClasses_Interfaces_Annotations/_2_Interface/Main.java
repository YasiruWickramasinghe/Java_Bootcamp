package _3_OOP._5_AbstractClasses_Interfaces_Annotations._2_Interface;

public class Main {
    public static void main(String[] args) {
//        Engine car = new Car();
//        car.a;
//        car.acc();
//        car.start();
//        car.stop();
//        Media carMedia = new Car();
//        carMedia.stop();


        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();
    }
}
