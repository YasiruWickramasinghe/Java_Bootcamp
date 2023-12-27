package _2_String._2_String_Builder;

public class Palindrome {
    //question regarding string palindrome

    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        if(str.length() == 0){
            return true;
        }

        str = str.toLowerCase();
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
