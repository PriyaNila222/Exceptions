package com.company;

//Handle the Arithmetic Exception using try-catch block

public class Program2 {
    public static void main(String[] args) {
        try {
            int number1 = 20;
            int number2 = 0;
            int divide = number1/number2;
            System.out.println("Division of" + number1 + "and" + number2 + "is: " + divide);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }


    }
}
