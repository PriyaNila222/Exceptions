package com.company;

//Write a program with multiple catch block

public class Program4 {
    public static void main(String[] args) {
        try {
            int[] number = new int[3];
            number[4] = 20  /0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
