package com.company;

//Write a program to generate NumberFormatException

public class Program16 {
    public static void main(String[] args) {
        try {
            String input = null;
            int value = Integer.parseInt(input);
            System.out.println(value);
        }
        catch (NumberFormatException e) {
            System.out.println(e);
        }

    }
}
