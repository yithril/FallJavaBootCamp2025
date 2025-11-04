package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Emily", "Johnson", 24),
                new Person("Michael", "Anderson", 31),
                new Person("Sophia", "Martinez", 27),
                new Person("James", "Thompson", 45),
                new Person("Emily", "Carter", 22),
                new Person("Daniel", "Brown", 36),
                new Person("Olivia", "White", 19),
                new Person("Jacob", "Davis", 28),
                new Person("Ava", "Robinson", 33),
                new Person("Ethan", "Clark", 41),
                new Person("Isabella", "Rodriguez", 26),
                new Person("Liam", "Walker", 30),
                new Person("Sophia", "Hernandez", 38),
                new Person("Noah", "Lewis", 29),
                new Person("Mason", "Hall", 43),
                new Person("Mia", "Allen", 21),
                new Person("James", "Young", 34),
                new Person("Charlotte", "King", 25),
                new Person("Aiden", "Scott", 37),
                new Person("Olivia", "Adams", 32)
        );

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a first or last name:");
        String searchName = scanner.nextLine();

        //imperative
        for(Person person : people){
            if(person.getFirstName().equalsIgnoreCase(searchName)
              || person.getLastName().equalsIgnoreCase(searchName)){
                System.out.println(person.toString());
            }
        }
    }
}