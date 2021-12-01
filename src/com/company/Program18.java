package com.company;

//Write a program to generate SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Program18 {
    static final String DB_URL = "jdbc:mysql://localhost/";
    static final String USER = "root";
    static final String PASS = "welcome123";
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement statement = connection.createStatement();
             ) {
                statement.execute("CREATE DATABASE STUDENT");
        }
        catch (SQLException e) {
            System.out.println(e);;
        }
    }
}
