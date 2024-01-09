package _3_OOP._7_CollectionsFramework_VectorClass_Enums._1_Collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

//        list2.add(34) ;
//        list2.add(78);
//        list2.add(55);
//        list2.add(89);
//
//        System.out.println(list2);


        //vector
        List<Integer> vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(56);

        System.out.println(vector);
    }
}
