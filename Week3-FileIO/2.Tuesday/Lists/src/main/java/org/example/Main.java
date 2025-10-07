package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Arraylists are more flexible than arrays
        //They can be resized, meaning you can add and remove stuff from them
        //Otherwise, they're VERY similar to arrays

        List<String> groceryList = new ArrayList<>();

        //Adding grocery items to our list
        groceryList.add("Orange Juice");
        groceryList.add("Chocolate");
        groceryList.add("Cereal");

        //You can add as many times as you please
        //You can remove as many things as you want
        groceryList.remove("Orange Juice");

        //Lists do act a lot like arrays
        groceryList.set(0, "Peanut Butter");

        //Get the thing at index 1
        groceryList.get(1);

        //Looping through lists with a for loop
        //Use an enhanced for loop
        for(String item : groceryList){
            System.out.println(item);
        }
    }
}