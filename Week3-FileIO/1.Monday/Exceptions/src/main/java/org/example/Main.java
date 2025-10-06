package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Brand new calculator app
        Scanner scanner = new Scanner(System.in);

        try{
            //Our calculator can only divide, for now
            System.out.println("What is the first number?");
            int firstNumber = scanner.nextInt();

            System.out.println("What is the second number?");
            int secondNumber = scanner.nextInt();

            int quotient = firstNumber / secondNumber;
            System.out.println("Your number is: " + quotient);
        }
        catch(ArithmeticException ex){
            System.out.println("Sorry cannot divide by zero.");
        }
        catch(InputMismatchException ex){
            System.out.println("Please type in a number.");
        }
        catch(Exception ex){
            System.out.println("If it's not the first two exceptions, then it comes here.");
        }

        System.out.println("Thank you for using our calculator!");
    }
}