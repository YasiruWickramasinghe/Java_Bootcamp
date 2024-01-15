package _7_Multithreading._2_Runnable_Inteface;


// Main Class
class Multithread {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread obj = new Thread(new Multithreading());
            obj.start();
        }
    }
}