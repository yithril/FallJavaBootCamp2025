package org.example;

import java.util.Scanner;

public class Parsing {
    public static void main(String[] args) {
        //Sometimes the scanner eats our input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number:");
        int number = Integer.parseInt(scanner.nextLine());

        System.out.println("Give me a string:");
        String userInput = scanner.nextLine();

        //check if a string is blank
        //you'll have to use an if statement
        if(userInput.isBlank() || userInput.isEmpty()){
            System.out.println("Please type something in.");
        }

        System.out.println("Thank you.");
    }
}
