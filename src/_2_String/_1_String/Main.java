package _2_String._1_String;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String name = "Yasiru Wickramasinghe";
        //System.out.println(name);

        //immutability();
        //comparison();
        //getCharacters();
        //printStream();
        //prettyPrinting();
        //concatenation();
        //performance();
        methods();


    }

    private static void immutability() {
        String a  = "yasiru";
        System.out.println(a);

        //this create new object
        String b = "sajith";
        System.out.println(b);
    }

    private static void comparison() {
        String a = "yasiru";
        String b = "yasiru";

        // ==
        System.out.println(a == b); // get true because here check reference pointing same object

        // equals() method
        //System.out.println(a.equals(b));

        String name1 = new String("kunal");
        String name2 = new String("kunal");

        System.out.println(name1 == name2); // get false because here check reference pointing to string but the two deference object
        System.out.println(name1.equals(name2)); // her check only value therefore here give true

    }

    private static void getCharacters() {
        String name1 = new String("yasiru wickramasinghe");

        System.out.println(name1.charAt(5));
        System.out.println(name1.charAt(6)); // print spaces as well
        System.out.println(name1.charAt(7));

    }

    private static void printStream() {
        System.out.println(56);

        //convert to wrapper class
//        Integer num = new Integer(56);
//        System.out.println(num.toString()); // same thing will print
//        System.out.println(num);

        System.out.println("yasiru");
        System.out.println(new int[] {1,2,3,4}); // here printing reference value og this object
        System.out.println(Arrays.toString(new int[] {1,2,3,4})); // use toString method available in Arrays class not String class

        String name = null;
        System.out.println(name);

    }

    private static void prettyPrinting() {

        /**
         * General Format:
         *
         *      %s: String
         *      %d: Decimal (integer)
         *      %f: Floating-point (decimal)
         *      %c: Character
         *      %b: Boolean
         *
         * Width and Precision:
         *
         *      %nd: Minimum width of n characters for the integer (pad with spaces if necessary).
         *      %.nf: Display n digits after the decimal point for a floating-point number.
         *
         * Flags:
         *
         *      %-: Left-justify within the specified width.
         *      %+: Include a sign (+ or -) for numeric values.
         *      %0: Pad numbers with leading zeros.
         *
         * Argument Index:
         *
         *      %1$, %2$, ...: Specify the index of the argument to be formatted.
         */

        float  a = 453.1234f;
        //round to two digits
            //System.out.printf("Formatted number is %.2f", a);

            //System.out.println(Math.PI);
        //get till 3 digits
            //System.out.printf("Formatted number is %.3f", Math.PI);

            System.out.printf("Hello my name is %s and i am %s", "yasiru", "cool");

    }

    private static void concatenation() {
        System.out.println('a' + 'b'); // convert to ASCII value and add = 195

        System.out.println("a" + "b"); // ab
        //System.out.println("a" - "b"); // operator '-' cannot be applied to 'java.lang.String', 'java.lang.String'

        System.out.println('a' + 3); // 100
        System.out.println((char)('a' + 3)); //casting to character == d

        System.out.println("a" + 1); // a1
        //this is same as after a few step "a" + "1"
        // integer will be converted to Integer that will call toString()

        //System.out.println("yasiru" + new ArrayList<>());
        //System.out.println("yasiru" + new Integer(56));

        //System.out.println(new Integer(56) + new ArrayList<>()); // this will give arrays

        //plus operator only works with primitives, if not at least string object needed
        //System.out.println(new Integer(56) +""+ new ArrayList<>()); // this will work


    }

    private static void performance() {
        String series = "";

//        for (int i = 0; i < 26; i++) {
//            char ch = (char)('a' + i);
//            System.out.println(ch);
//        }

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);
    }

    private static void methods() {
        String name = "YASIRU WICKRAMASINGHE HEllo World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('A'));
        System.out.println(Arrays.toString(name.split(" "))); // break down parts based on spaces // [YASIRU, WICKRAMASINGHE, HEllo, World]


        System.out.println("     YASIRU      ".strip()); // remove the extra spaces

    }

}
