package _1_Basic._6_SwitchStatement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fruit name: ");
        String fruit = sc.next();

        switch (fruit) {
            case "apple":
                System.out.println("print apple");
                break;
            case "orange":
                System.out.println("print orange");
                break;
            case "mango":
                System.out.println("print mango");
                break;
            case "grapes":
                System.out.println("print grapes");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }

        //enhances switch statement
        //no need to put break;
        switch (fruit) {
            case "apple" -> System.out.println("print apple");
            case "orange" -> System.out.println("print orange");
            case "mango" -> System.out.println("print mango");
            case "grapes" -> System.out.println("print grapes");
            default -> System.out.println("please enter a valid fruit");
        }

        System.out.println("Enter a day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("please enter a valid fruit");
        }

        //enhanced switch statement
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("please enter a valid fruit");
        }

        //enhances switch statement
        System.out.println("Enter Employee id: ");
        int empNo = sc.nextInt();
        System.out.println("Enter Department: ");
        String dep = sc.next();

        switch (empNo) {
            case 1:
                System.out.println("yasiru wickramasinghe");
                break;
            case 2:
                System.out.println("Vishmika jayasinhge");
                break;
            case 3:
                System.out.println("Muthu Wijenayake");
                break;
            case 4:
                System.out.println("Pinki Wijenayake");
                switch (dep){
                    case "IT":
                        System.out.println("print IT");
                        break;
                    case "Business":
                        System.out.println("print Business");
                        break;
                    case "HR":
                        System.out.println("print HR");
                        break;
                    case "AI":
                        System.out.println("print AI");
                        break;
                    default:
                        System.out.println("please enter a valid department");
                }
                break;
            default:
                System.out.println("please enter a valid id");
        }

        switch (empNo) {
            case 1 -> System.out.println("yasiru wickramasinghe");
            case 2 -> System.out.println("Vishmika jayasinhge");
            case 3 -> System.out.println("Muthu Wijenayake");
            case 4 -> {
                System.out.println("Pinki Wijenayake");
                switch (dep) {
                    case "IT" -> System.out.println("print IT");
                    case "Business" -> System.out.println("print Business");
                    case "HR" -> System.out.println("print HR");
                    case "AI" -> System.out.println("print AI");
                    default -> System.out.println("please enter a valid department");
                }
            }
            default -> System.out.println("please enter a valid id");
        }


    }
}
