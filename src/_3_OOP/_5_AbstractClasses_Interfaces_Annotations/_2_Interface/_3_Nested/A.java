package _3_OOP._5_AbstractClasses_Interfaces_Annotations._2_Interface._3_Nested;

public class A {
    // nested interface
    public interface NestedInterface {
        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {
    @Override
    public boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}