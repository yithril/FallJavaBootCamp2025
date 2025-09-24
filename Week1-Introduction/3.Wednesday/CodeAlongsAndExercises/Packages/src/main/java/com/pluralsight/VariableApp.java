package com.pluralsight;

public class VariableApp {
    public static void main(String[] args) {
        /*
        Everything between the two symbols is a comment
        No matter how many lines
         */
        //1. Declare a variable to store your favorite color
        String color = "Blue";
        //2. Declare a variable to store the year you started this class
        int classStart = 2025;
        //3. Declare a variable to store your middle initial
        char middleInitial = 'L';
        //4. Declare a variable to store whether you have pets (yes/no)
        boolean pets = true;
        //Print each variable with a descriptive message
        System.out.println("My favorite color is " + color +" and I started class in " + classStart);

        //println is cool, printf is better
        System.out.printf("My favorite color is %s and I started class %d", color, classStart);

        //format money
        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;

        System.out.println("The tax is: " + tax);
        //printf will make it look nice and neat for money
        System.out.printf("The tax is: $%.2f", tax);
    }
}
