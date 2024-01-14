package _6_File_Handling;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    String currentDir = System.getProperty("user.dir");

    // create
    try {
      File fo = new File(currentDir + "/src/_6_File_Handling/new-file.txt");
      fo.createNewFile();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // write in the file
    try {
      FileWriter fw = new FileWriter(currentDir + "/src/_6_File_Handling/new-file.txt");
      fw.write("සියලු ආගම් අත්හැර මා පමණක් සරණ යන්න, මම ඔබව සියලු පාපයන්ගෙන් ගලවා ගන්නෙමි, දුක් නොවන්න.");
      fw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // reading from a file
    try (BufferedReader br = new BufferedReader(new FileReader(currentDir + "/src/_6_File_Handling/new-file.txt"))) {
      while (br.ready()) {
        System.out.println(br.readLine());
      }
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

    // create
    try {
      File fo = new File(currentDir + "/src/_6_File_Handling/random.txt");
      fo.createNewFile();
      if(fo.delete()) {
        System.out.println(fo.getName());
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }
}