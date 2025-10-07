package org.example;

import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = new String[10];

        quotes[0] = "The only thing we have to fear is fear itself. - Franklin D. Roosevelt";
        quotes[1] = "In the middle of difficulty lies opportunity. - Albert Einstein";
        quotes[2] = "Do not go where the path may lead, go instead where there is no path and leave a trail. - Ralph Waldo Emerson";
        quotes[3] = "The journey of a thousand miles begins with one step. - Lao Tzu";
        quotes[4] = "That which does not kill us makes us stronger. - Friedrich Nietzsche";
        quotes[5] = "Success is not final, failure is not fatal: it is the courage to continue that counts. - Winston Churchill";
        quotes[6] = "You miss 100% of the shots you don’t take. - Wayne Gretzky";
        quotes[7] = "The best way to predict the future is to invent it. - Alan Kay";
        quotes[8] = "It always seems impossible until it’s done. - Nelson Mandela";
        quotes[9] = "Be yourself; everyone else is already taken. - Oscar Wilde";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please pick a number from 1-10 to see the quote.");

        //unsafe!!!
        int userInput = scanner.nextInt();

        //also unsafe!
        System.out.printf("Your quote is: %s", quotes[userInput - 1]);
    }
}
