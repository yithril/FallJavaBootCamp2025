package org.example;

public class Main {
    public static void main(String[] args) {
        Drink drink = new Drink("Matcha Latte");

        //How much should this drink be?
        System.out.println("Your matcha latte is: " + drink.getPrice());

        Drink secondDrink = new Drink("Americano", DrinkSize.LARGE);

        //how much should this drink be?
        System.out.println("Your americano is: " + secondDrink.getPrice());

        Drink thirdDrink = new Drink("Frappe", DrinkSize.SMALL, true);

        //How much should this last drink be?
        System.out.println("Your frappe is: " + thirdDrink.getPrice());

        Drink fourthDrink = new Drink("Iced Coffee", DrinkSize.LARGE, true);

        System.out.println(thirdDrink.getSize());
    }
}