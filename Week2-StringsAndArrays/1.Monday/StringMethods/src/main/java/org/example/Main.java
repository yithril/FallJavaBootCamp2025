package org.example;

public class Main {
    public static void main(String[] args) {
        //useful string methods (behaviors)
        String myName = "Jonathan";

        //toLowerCase() toUpperCase()
        System.out.println(myName.toUpperCase());
        System.out.println(myName.toLowerCase());

        //Can you print using multiple methods?
        System.out.println("Upper case: " + myName.toUpperCase() + " Lower case: " + myName.toLowerCase());

        String lotsOfWhitespace = "      whitespace      ";
        System.out.println(lotsOfWhitespace.trim());

        String reallyLongName = "Super Long Name";
        System.out.println(reallyLongName.length());

        String secretName = "Robert";
        if(secretName.startsWith("R")){
            System.out.println("Your name starts with an R!");
        }
    }
}