package com.userinput;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        //We're going to ask the user their name
        //Then we will greet the user with their name
        System.out.println("Hi! What's your name?");

        //I need something to help me figure out what the user types
        //The Scanner will do that for me
        Scanner scanner = new Scanner(System.in);

        //let's use the scanner to collect information from the keyboard
        String userInput = scanner.nextLine();

        System.out.printf("Hi there %s", userInput);

        System.out.println("What is your favorite color?");
        String favoriteColor = scanner.nextLine();

        System.out.printf("Your favorite color is %s", favoriteColor);

        System.out.println("How old are you?");

        int age = scanner.nextInt();

        System.out.printf("You are %d years old", age);
    }
}
