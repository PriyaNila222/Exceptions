package com.company;

//Write a program to generate StringIndexOutOfBoundException

public class Program17 {
    public static void main(String[] args) {
        try {
            String string = "My name is Priya";
            int stringLength = string.length();
            System.out.println(string.charAt(stringLength + 1));
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
