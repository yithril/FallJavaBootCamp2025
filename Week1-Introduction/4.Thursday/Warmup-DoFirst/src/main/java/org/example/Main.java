package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ============================
        // PART 1: STRING CONCATENATION
        // ============================

        // 1. Create two String variables: one for a food and one for a drink.
        //    Print a sentence using + that says something like:
        //    "I had pizza and soda for lunch."
        String food = "pizza";
        String drink = "soda";
        System.out.println("I had " + food + " and " + drink + " for lunch.");

        // 2. Create an int variable for your age.
        //    Print a sentence that says: "I am ___ years old."
        int myAge = 30;
        System.out.println("I am " + myAge + " years old.");

        // 3. (Challenge) Use Scanner to ask the user for their name and favorite color.
        //    Then print a sentence like: "Alex's favorite color is blue."
        //    (Hint: import java.util.Scanner at the top of the file)
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What's your name?");
//        String name = scanner.nextLine();
//        System.out.println("What's your favorite color?");
//        String favoriteColor = scanner.nextLine();
//        System.out.printf("%s favorite color is %s", name, favoriteColor);

        // ============================
        // PART 2: USING PRINTF
        // ============================

        // 4. Create a String for a movie, an int for its release year,
        //    and a double for its rating.
        //    Use printf to print: "Inception was released in 2010 and has a rating of 8.5."
        String movieName = "Movie";
        int year = 2015;
        double rating = 7.4;
        System.out.printf("%s was released on %d and has a rating of %.2f",
                movieName, year, rating);

        // 5. Create variables: a product (String), a price (double), and a quantity (int).
        //    Use printf to print a sentence like:
        //    "You bought 3 apples at $0.99 each."
        String product = "bananas";
        double price = 1.06;
        int quantity = 5;
        System.out.printf("%n You bought %d %s for $%.2f each",
                quantity, product, price);

        // ============================
        // PART 3: CHALLENGE DRILL
        // ============================

        // 7. Create variables:
        //    - String city
        //    - int population
        //    - double temperature
        //    Print a formatted sentence like:
        //    "Tokyo has a population of 14,000,000 and an average temperature of 22.5°C."
    }
}