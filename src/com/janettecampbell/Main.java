package com.janettecampbell;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // This is a single line comment.
        /*
        * This is a multi line comment
        * This prints to the console
        * */
        int number = 100;
        String name = "Janette";
        Date date = new Date();

        byte theByte = -128;
        short theShort = 32_000;
        int theInt = 787_838_334;
        long theLong = 78_783_833_432L;

        float pi = 3.14F;
        double doublePi = 3.1415;

        boolean isAdult = true;

        char nameInitial = 'J';

        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(nameInitial);

        // Non primative data types AKA reference types
        String name1 = new String("Janette");
        System.out.println(name1.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());

        // Primative data types
        int a = 10;
        int b = a;
        a = 100;

        System.out.println("a: "+ a + " - b: " + b);

        // Reference types
        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";
        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);

        // naming vriables
        int zero = 0;
        int one = 1;
        double pi1 = 3.1415;
        int subscriberCountForAmigoscode = 1_000_000;

        // String class
        String name2 = "Amigoscode";
        System.out.println(name2.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name2.charAt(1));

        String code = "code";
        System.out.println(name2.contains(code));
        System.out.println(name.equals(code));

        Date date1 = new Date();
        java.sql.Date dateSql = new java.sql.Date(1);
        String s = new String();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        // Arithmetic Operations
        System.out.println(10 + 2);
        System.out.println(10 - 2);
        System.out.println(10 * 2);
        System.out.println(10 / 2);
        System.out.println(10 % 2);
        System.out.println(10 * 2 + 7);
        System.out.println(10 * (2 + 7));
        System.out.println(10 * (2 + 7) - 10);

    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}