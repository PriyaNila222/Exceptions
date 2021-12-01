package com.company;

//Write a program to generate ClassNotFoundException

public class Program10 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
