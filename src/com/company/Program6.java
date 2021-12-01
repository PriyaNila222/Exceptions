package com.company;

//Write a program to create your own exception

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        try {
            withdraw(amount);
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void withdraw(int amount) throws CustomException {
        if(amount <= 5000) {
            System.out.println("Please collect the amount");
        } else {
            throw new CustomException();
        }
    }
}
