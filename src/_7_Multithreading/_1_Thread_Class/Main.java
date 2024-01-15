package _7_Multithreading._1_Thread_Class;


// Main Class
public class Main {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Multithreading obj = new Multithreading();
            obj.start();
        }
    }
}