package com.pluralsight;


import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first name:");
        String firstName = keyboard.nextLine();
        System.out.println("First Name: " + firstName);
//        System.out.printf("First Name: %s", firstName);


        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("Age: " + age);
        keyboard.nextLine();

        //ask user to input a number of some type
        //and then ask the user to enter a string
        //you need to call keyboard.nextLine() before asking for the string

    }

}
