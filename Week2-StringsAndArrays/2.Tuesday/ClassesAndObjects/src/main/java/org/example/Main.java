package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person customer1 = new Person("Bob Jones", 35, 235, true);
        Person customer2 = new Person("Shamar", 27, 270, false);

        System.out.println(customer1.getName());
        customer1.setName("Mergatroid Alousicous");
        System.out.println(customer1.getName());
    }
}