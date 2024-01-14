package _6_File_Handling;

import java.io.*;

class Output {
    public static void main(String[] args) {
        //outputWrite();
        //fileWriter();
        bufferWriter();
    }

    static void outputWrite(){
        //OutputStream os = System.out;
        //os.write(😍); // range is exceeded

        try (OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World");
            osw.write(97);
            osw.write(10);
            osw.write('A');
            osw.write('\n');
            char[] arr = "hello world".toCharArray();
            osw.write(arr);
            // osw.write(😍); // range is exceeded
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static void fileWriter() {
        String currentDir = System.getProperty("user.dir");
        try (FileWriter fw = new FileWriter(currentDir + "/src/_6_File_Handling/write.txt", true)) {
            fw.write("FIleWriter using - > Write name yasiru");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    static void bufferWriter() {
        String currentDir = System.getProperty("user.dir");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(currentDir + "/src/_6_File_Handling/write.txt"))) {
            bw.write("Buffer Writter -> Write name yasiru is kind student");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}