package com.company;

//Write a program to generate NullPointerException

public class Program15 {
    public static void main(String[] args) {
        try {
            String input = null;
            System.out.println(input.toLowerCase());
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
