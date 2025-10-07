package org.example;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> groceryList = new ArrayList<>();

        groceryList.add("Orange Juice");
        groceryList.add("Coffee");
        groceryList.add("Peanut Butter");
        groceryList.add("Nutella");

        groceryList.set(2, "Cranberry Juice");

        for(String item : groceryList){
            System.out.println(item);
        }
    }
}
