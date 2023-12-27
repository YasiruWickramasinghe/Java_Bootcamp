package _2_String._2_String_Builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        StringBuilder sb = new StringBuilder();

//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            sb.append(ch);
//        }
//        System.out.println(sb.toString());

        methods();



    }

    private static void methods() {

        //Appending and Inserting:
        //You can append or insert various data types, such as strings, characters, numbers, etc., to the StringBuilder:

        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" World"); // Appends a string
        sb1.append('!'); // Appends a character
        sb1.insert(6, ","); // Inserts a character at a specific position


        //Deleting and Replacing:
        //You can delete characters or replace portions of the StringBuilder:

        StringBuilder sb2 = new StringBuilder("Hello, World!");
        sb2.delete(5, 13); // Deletes characters from index 5 to 12
        sb2.replace(0, 5, "Hi"); // Replaces characters from index 0 to 4 with "Hi"


        //Capacity and Length:
        //The capacity() method returns the current capacity of the StringBuilder, and the length() method returns the current length (number of characters):

        StringBuilder sb3 = new StringBuilder("Hello");
        int capacity = sb3.capacity();
        int length = sb3.length();


        //Converting to String:
        //You can convert the StringBuilder to a String using the toString() method:

        StringBuilder sb4 = new StringBuilder("Hello");
        String result = sb4.toString();


        //Chaining Methods:
        //Many methods in StringBuilder return a reference to the StringBuilder instance, allowing for method chaining:

        StringBuilder sb5 = new StringBuilder();
        sb5.append("Hello").append(" ").append("World");
    }

}
