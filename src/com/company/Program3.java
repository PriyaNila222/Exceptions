package com.company;

//Write a method which throws exception, call that method in main class without try-catch block

public class Program3 {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 0;
        int result = division(number1, number2);
        System.out.println("Division of" + number1 + "and" + number2 + "is: " + result);
    }

    public static int division(int number1, int number2) throws ArithmeticException{
        int division = number1 / number2;
        return division;
    }
}
