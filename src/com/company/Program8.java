package com.company;

//Write a program to generate ArithmeticException

public class Program8 {
    public static void main(String[] args) {
        try {
            int number1 = 20;
            int number2 = 0;

            int divide = number1/number2;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}
