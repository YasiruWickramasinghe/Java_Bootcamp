package _1_Basic._10_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax for declaring a 2D ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialization of the 2D ArrayList
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        // Adding elements to the 2D ArrayList
        System.out.print("Enter elements for the 2D ArrayList:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }
        }

        // Print the 2D ArrayList
        System.out.println("Printing 2D ArrayList:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
