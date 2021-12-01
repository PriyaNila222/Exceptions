package com.company;

//Write a program to generate IOException

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Program12 {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("Sample.txt");
            int content = fileReader.read();
        }
        catch (IOException e) {
            System.out.println(e);
        }
        finally {
            if(fileReader != null) {
                try {
                    fileReader.close();
                    System.out.println("File is read successfully");
                }
                catch (IOException e) {
                    System.out.println(e);
                }
            }

        }

    }
}