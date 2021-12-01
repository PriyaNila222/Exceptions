package com.company;

//Write a program to generate FileNotFoundException

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Program11 {
    public static void main(String[] args) {
        try {
            File file = new File("Test.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
        }

        catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
