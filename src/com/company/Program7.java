package com.company;

//Write a program with finally block

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file location: ");
        String fileLocation = scanner.nextLine();

        File file = new File(fileLocation);

        try {
            fileReader = new FileReader(file);
            int content = fileReader.read();
        }
        catch (IOException IO) {
            System.out.println("File cannot be read");
        }
        finally {
            if(fileReader != null) {
                try {
                    fileReader.close();
                    System.out.println("File is read successfully");
                }
                catch (IOException IO) {
                    IO.printStackTrace();
                }
            }
        }
    }
}
