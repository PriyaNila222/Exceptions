package com.company;

//Write a program to generate ArrayIndexOutOfBoundException

public class Program9 {
    public static void main(String[] args) {
        int size = 5;
        try {
            int array[] = new int[size];
            array[6] = 20;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
