package org.example;

import java.util.Arrays;

public class ArrayShorter {
    public static void main(String[] args) {
        int[] ages = { 12, 15, 200, 1000, 45 };

        Person[] people = {
                new Person("Bob", 25),
                new Person("Steve", 100)
        };

        //we can sort simple, but not complex things like objects
        String[] fruits = { "Banana", "Cherry", "Grape", "Mango" };

        Arrays.sort(fruits);

        //Cannot directly print out an array, you need use a loop
        System.out.println(fruits);
    }
}
