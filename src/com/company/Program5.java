package com.company;

//Write a program to throw exception with your own message

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();

        validate(amount);
    }

    public static void validate(int amount) {
        if(amount > 10000) {
            throw new IllegalArgumentException("Withdrawl amount limit is 10000INR");
        } else {
            System.out.println("Please collect the amount");
        }
    }
}

