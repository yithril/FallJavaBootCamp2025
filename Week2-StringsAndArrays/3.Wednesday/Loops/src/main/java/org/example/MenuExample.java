package org.example;

import java.util.Scanner;

public class MenuExample {
    public static void main(String[] args) {
        //while loops are GREAT for menus
        //The user can do what they want, and then exit when they want
        //There is a little trick we can do to make this easy

        //If you need a scanner, make it BEFORE the while loop
        Scanner scanner = new Scanner(System.in);

        while(true){
            //Give the user choices
            System.out.println("Welcome to Financial Calculator");
            System.out.println("1) Mortgage Payment");
            System.out.println("2) Lease Payment");
            System.out.println("3) Exit");
            String userInput = scanner.nextLine();

            switch(userInput){
                case "1":
                    System.out.println("Here is your mortgage payment.");
                    break;
                case "2":
                    System.out.println("Here is your lease payment.");
                    break;
                case "3":
                    System.out.println("Thank you and goodbye.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please type 1, 2, or 3");
                    break;
            }
        }
    }
}
