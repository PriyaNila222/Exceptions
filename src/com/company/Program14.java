package com.company;

//Write a program to generate NoSuchMethodException

public class Program14 {

    public static void main(String[] args) {
        System.out.println("String = " + display());
    }

    private static String display() {
        return Hello.display();
    }
}
