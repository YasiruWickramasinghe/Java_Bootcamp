package _6_File_Handling;

import java.io.*;

class Input {

  public static void main(String[] args) {
    //inputRead();
    //fileRead();
    bufferRead();
  }

  static void inputRead(){
    //Input Reader
    try (InputStreamReader isr = new InputStreamReader(System.in)) {
      System.out.print("Enter some letters:");
      int letters = isr.read();
      while(isr.ready()) {
        System.out.println((char) letters);
        letters = isr.read();
      }
      // isr.close();
      System.out.println();
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
  }

  static void fileRead(){
    //file Reader
    String currentDir = System.getProperty("user.dir");
    try (FileReader fr = new FileReader(currentDir + "/src/_6_File_Handling/read.txt")) {
      int letters = fr.read();
      while(fr.ready()) {
        System.out.println((char)letters);
        letters = fr.read();
      }
      // fr.close();
      System.out.println();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
  static void bufferRead() {
    String currentDir = System.getProperty("user.dir");
    // byte to char stream and then reading char stream
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      System.out.println("You typed: " + br.readLine());
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    try (BufferedReader br = new BufferedReader(new FileReader(currentDir + "/src/_6_File_Handling/read.txt"))) {
      while (br.ready()) {
        System.out.println(br.readLine());
      }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }
  }

}