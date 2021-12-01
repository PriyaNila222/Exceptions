package com.company;

//Write a program to generate NoSuchFieldException

import java.lang.reflect.Field;

public class Program13 {
    public static void main(String[] args) {

        Program13 object = new Program13();
        Class class1 = object.getClass();

        try {
            Field field = class1.getField("Name");
        }
        catch (NoSuchFieldException e){
            System.out.println(e);
        }
    }
}
