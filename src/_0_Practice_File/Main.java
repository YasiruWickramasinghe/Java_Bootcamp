package _0_Practice_File;

import java.util.Scanner;


public class Main {

    public static void countNums(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int count = 0;
        while(num > 0){
            int rem = num % 10;

            if(rem == 3){
                count++;
            }

            num = num / 10;
        }

        System.out.println(count);
    }

    public static void reverseNums(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int res = 0;
        while(num > 0){
            int rem = num % 10;
            num = num / 10;

            res =  res * 10 + rem;
        }

        System.out.println(res);
    }

    public static void new1(){

        System.out.println("start in here");
    }

    public static void main(String[] args) {
        //countNums();
        //reverseNums();
        new1();
    }
}
