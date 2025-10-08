package org.example;

import java.util.Scanner;

//This template is to help you know where certain code should live
//This is to help you along if you're stuck
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create 20 Book objects manually
        Book[] books = new Book[20];
        books[0] = new Book(1, "9780000000001", "The Quantum Curse", false, "");
        books[1] = new Book(2, "9780000000002", "Whispers in the Attic", false, "");
        books[2] = new Book(3, "9780000000003", "Starfarer", false, "");
        books[3] = new Book(4, "9780000000004", "The Dragon's Oath", false, "");
        books[4] = new Book(5, "9780000000005", "Midnight on Mars", false, "");
        books[5] = new Book(6, "9780000000006", "Library of Bones", false, "");
        books[6] = new Book(7, "9780000000007", "Circuit of Dreams", false, "");
        books[7] = new Book(8, "9780000000008", "Crown of Embers", false, "");
        books[8] = new Book(9, "9780000000009", "Neon Horizon", false, "");
        books[9] = new Book(10, "9780000000010", "The Last Archivist", false, "");
        books[10] = new Book(11, "9780000000011", "Echoes of Avalon", false, "");
        books[11] = new Book(12, "9780000000012", "Ghost Code", false, "");
        books[12] = new Book(13, "9780000000013", "Forest of Mirrors", false, "");
        books[13] = new Book(14, "9780000000014", "Empire of Dust", false, "");
        books[14] = new Book(15, "9780000000015", "Abyssal Tide", false, "");
        books[15] = new Book(16, "9780000000016", "Chronicle of Ash", false, "");
        books[16] = new Book(17, "9780000000017", "Silver Comet", false, "");
        books[17] = new Book(18, "9780000000018", "Haunted Harbor", false, "");
        books[18] = new Book(19, "9780000000019", "Voyage of Nine Suns", false, "");
        books[19] = new Book(20, "9780000000020", "Golem’s Lament", false, "");

        boolean running = true;
        while (running) {
            System.out.println("\n=== BOOK STORE HOME SCREEN ===");
            System.out.println("1. Show Available Books");
            System.out.println("2. Show Checked Out Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("\n--- AVAILABLE BOOKS ---");
                for (Book b : books) {
                    if (!b.isCheckedOut()) {
                        System.out.printf("%d | %s | %s%n", b.getId(), b.getIsbn(), b.getTitle());
                    }
                }

                System.out.print("\nEnter ID to check out or X to return: ");
                String input = scanner.nextLine();
                if (!input.equalsIgnoreCase("X")) {
                    try {
                        int id = Integer.parseInt(input);
                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();

                        for (Book b : books) {
                            if (b.getId() == id && !b.isCheckedOut()) {
                                b.checkOut(name);
                                System.out.println("Book checked out successfully!");
                            }
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input.");
                    }
                }

            } else if (choice.equals("2")) {
                System.out.println("\n--- CHECKED OUT BOOKS ---");
                for (Book b : books) {
                    if (b.isCheckedOut()) {
                        System.out.printf("%d | %s | %s | Checked out to: %s%n",
                                b.getId(), b.getIsbn(), b.getTitle(), b.getCheckedOutTo());
                    }
                }

                System.out.print("\nEnter C to check in a book or X to go back: ");
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("C")) {
                    System.out.print("Enter the ID of the book to check in: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    for (Book b : books) {
                        if (b.getId() == id && b.isCheckedOut()) {
                            b.checkIn();
                            System.out.println("Book checked in!");
                        }
                    }
                }

            } else if (choice.equals("3")) {
                System.out.println("Exiting program...");
                running = false;
            } else {
                System.out.println("Invalid option.");
            }
        }
    }


}