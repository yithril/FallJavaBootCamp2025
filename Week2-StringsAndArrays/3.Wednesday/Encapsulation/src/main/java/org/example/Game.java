package org.example;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        System.out.println("Welcome to world of Java!");
        System.out.println("What is your character's name?");

        Scanner scanner = new Scanner(System.in);

        //collect their character's name
        String name = scanner.nextLine();

        System.out.println("What is your character's profession?");
        System.out.println("Wizard? Fighter? Cleric? Thief?");
        String profession = scanner.nextLine();

        GameCharacter player1 = new GameCharacter(name, profession);

        System.out.println("Welcome to the game " + name + "!");
        System.out.println("You are level " + player1.getLevel());
        System.out.println("You have " + player1.getXp() + " xp!");


    }
}
