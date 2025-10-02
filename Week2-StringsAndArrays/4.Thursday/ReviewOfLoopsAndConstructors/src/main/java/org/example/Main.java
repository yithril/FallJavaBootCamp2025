package org.example;

public class Main {
    public static void main(String[] args) {
        //for loops, while loops, do while loops
        //while loops do it till I tell you to stop
        //for loops you have a number in mind

        //I love Java 5 times
        for(int i = 1; i <= 5; i += 3){
            System.out.println("I love java");
        }

        //+= is a shortcut
        int someNumber = 10;
        someNumber += 5;

        someNumber++;

        //while loops
        //Use a while loop to count from 1 to 10 and then stop
        int count = 0;
        while(count <= 10){
            System.out.println("Java is awesome!!!");
            count++;
        }

        //do whiles are used when you need the code to run
        //at LEAST one time
        int count2 = 11;
        do {
            System.out.println("Do while loop");
            count2++;
        }
        while(count2 <= 10);
    }
}