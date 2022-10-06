package com.janettecampbell;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

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
        System.out.println();

        // Non primative data types AKA reference types
        String name1 = new String("Janette");
        System.out.println(name1.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
        System.out.println();

        // Primative data types
        int a = 10;
        int b = a;
        a = 100;

        System.out.println("a: "+ a + " - b: " + b);
        System.out.println();

        // Reference types
        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";
        System.out.println("after changing alex");
        System.out.println(alex.name + " " + mariam.name);
        System.out.println();

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
        System.out.println();

        // Arithmetic Operations
        System.out.println(10 + 2); // 12
        System.out.println(10 - 2); // 8
        System.out.println(10 * 2); // 20
        System.out.println(10 / 2); // 5
        System.out.println(10 % 2); // 0
        System.out.println(10 * 2 + 7);  //27
        System.out.println(10 * (2 + 7)); //90
        System.out.println(10 * (2 + 7) - 10); // 80
        System.out.println(10 * (2 + 7) - 4.5); // 85.5
        System.out.println();

        // Math class
        System.out.println(Math.abs(-10)); // 10
        System.out.println(Math.max(3.6, 10.11)); // 10.11
        System.out.println(Math.min(3.6, 10.11)); // 3.6
        System.out.println((int)Math.pow(5.0,2.0)); // 25
        System.out.println(Math.sqrt(25)); // 5
        System.out.println(Math.PI); // 3.141592653589793
        System.out.println();

        // Comparison Operators
         int khalidAge = 18;
         int mariamAge = 20;
         System.out.println(khalidAge > mariamAge); // false
         System.out.println(khalidAge >= mariamAge); // false
         System.out.println(khalidAge < mariamAge); // true
         System.out.println(khalidAge <= mariamAge); //true
         System.out.println(khalidAge == mariamAge); // false
         System.out.println(khalidAge != mariamAge); // true
        System.out.println();

         // Logical Operators
        boolean isAdult1 = false;
        boolean isStudent = true;
        boolean isAmigoscodeMember = true;
        String name3 = "Mark";
        System.out.println(isAdult1 && isStudent); // false
        System.out.println(isAdult1 || isStudent); // true
        System.out.println((isAdult1 || isStudent) && isAmigoscodeMember); // true
        System.out.println((!isAdult1 || isStudent) && isAmigoscodeMember); // true
        System.out.println((!isAdult1 || isStudent) && !isAmigoscodeMember); // false
        System.out.println(isAdult1); // false
        System.out.println((10 > 8 || 2 <= 2) && isAdult1 && name3.contains("M")); // false
        System.out.println();

        // If Statements
        int age = 17;

        if (age >= 18) {
            System.out.println("Hooray... I am an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I am almost an adult");
        } else {
            System.out.println("I am not an adult");
        }
        System.out.println();

        // Ternary Operator
        String message = age >= 18 ? "Hooray... I am an adult" : "I am not an adult";
        System.out.println(message);
        System.out.println();

        // Switch Statements
        String gender = "FEMALE";

        switch (gender.toUpperCase()) {
            case "FEMALE" :
                System.out.println("I am a female");
                break;
            case "MALE" :
                System.out.println("I am a male");
                break;
            case "PREFER_NOT_SAY" :
                System.out.println("I prefer not to say");
                break;
            default:
                System.out.println("Unknown gender");
        }
        System.out.println();

        // Arrays
        // Size of array cannot change once set
        int zero1 = 0;
        int one1 = 1;

        int[] numbers = {2, 0, 1, 4, 100};
        String [] names = {"Ali", "Maria"};
//        int[] numbers =  new int[3];
//        System.out.println(Arrays.toString(numbers)); // [0, 0, 0]
//        boolean[] numbers1 =  new boolean[3];
//        System.out.println(Arrays.toString(numbers1)); // [false, false, false]
//        String[] numbers2 =  new String[3];
//        System.out.println(Arrays.toString(numbers2)); // [null, null, null]

//        numbers[0] = 0;
//        numbers[1] = 1;
//        numbers[2] = 2;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);
        System.out.println();

        // Arrays and Indexes
        int [] numbers1 = {2, 0, 1, 4, 100, 78};
        int oneHundred = numbers1[4];
        int four = numbers1[3];
        int lastNumber = numbers1[numbers1.length - 1];
        System.out.println(oneHundred);
        System.out.println(four);
        System.out.println(lastNumber);
        System.out.println();

        // Loops -- & ++
        int [] numbers2 = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }

        System.out.println();
        // Reverse order
        for (int i = numbers2.length -1; i >= 0; i--) {
            System.out.println(numbers2[i]);
        }
        System.out.println();

        // Enhanced for Loop
        int [] numbers3 = {2, 0, 1, 4, 100, 4, 90, 78, 77};

        for (int i = 0; i < numbers3.length; i++) {
            System.out.println(numbers3[i]);
        }

        System.out.println("Enhanced for loop");

        for (int number3 : numbers3) {
            System.out.println(number3);
        }

        // Bonus Tips
        //for for loop type array.for and select for loop from pop up.
        // ex. numbers3.for(select fori);
        for (int i = 0; i < numbers3.length; i++) {
            
        }
        
        // for reverse for loop select forr
        // ex. numbers3.for(select forr);
        for (int i = numbers3.length - 1; i >= 0; i--) {
            
        }

        // for enhanced for loop select for
        // ex. numbers3.for(select for);
        for (int i : numbers3) {
            
        }

        // for streams
        Arrays.stream(numbers3).forEach(System.out::println);
        System.out.println();

        // Break and Continue
        String [] names4 = {"Anna", "Ali", "Bob", "Mike"};

        // Break
        for (String name4 : names4) {
            if (name4.equals("Bob")) {
                break;
            }
            System.out.println(name4);
        } // Output: Anna
            //       Ali
        System.out.println();

        // Continue
        for (String name4 : names4) {
            if (name4.startsWith("A")) {
                continue;
            }
            System.out.println(name4);
        } // Output: Bob
        //           Mike
        System.out.println();

        // While Loop
        int count = 0;

        while (count <= 20) {
            System.out.println("count: " + count);
            count++;
        }
        System.out.println();

        // Do While Loop
        int count1 = 21;

        do {
            System.out.println("count: " + count1);
            count1++;
        }
        while (count1 <= 20);
        System.out.println();

        // Scanner Class
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);

        System.out.print("How old are you? ");
        int age1 = scanner.nextInt();
        int year = LocalDate.now().minusYears(age1).getYear();
        System.out.println("You were born in " + year);

        if (age1 < 18) {
            System.out.println("You are not an adult. :(");
        } else {
            System.out.println("You are and adult. :)");
        }

    }

    static class Person {
        String name;
        Person(String name) {
            this.name = name;
        }
    }
}