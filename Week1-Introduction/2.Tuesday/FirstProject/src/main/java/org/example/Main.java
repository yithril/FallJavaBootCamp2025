package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi there!");
        System.out.println("Whatsup?");

        //This is a comment the computer will not read it
        //Variables
        //String is for text and text+numbers
        //Boolean is for true/false situations
        //We need to DECLARE a variable to let Java know it exists
        //DECLARING a variable follows a formula
        String name = "Jonathan";
        System.out.println(name);

        boolean isPremiumMember = false;
        char multipleChoice = 'A';

        //Numbers are more difficult
        //There are 4 categories for numbers we care about
        //If the number is a whole number (integer)
        int age = 40;
        long reallyBigNumber = 1000;
        //What if the number has a decimal?
        float temperature = 62.3f;
        double price = 10.99;

        //change the value of a variable already defined
        name = "George";
        name = "Jim";

        //MATH operations
        // + - * /
        int numberOfStores = 45 + 20;

        //PEMDAS
        //What if I want to do exponents?
        double toThePower = Math.pow(2, 4);

        //Putting strings together
        //String concatenation
        String customerName = "Mary Smith";
        System.out.println("Welcome to Jonathan Mart " + customerName + " and welcome back!");
    }
}