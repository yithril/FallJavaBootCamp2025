package org.example;

import java.util.Scanner;

public class ProductSearchMain {
    public static void main(String[] args) {
        System.out.println("Welcome! Type in the name of a product to search");

        Scanner scanner = new Scanner(System.in);

        var userInput = scanner.nextLine();

        //use the DB to search for the product
        ProductDao productDao = new ProductDao(args[0], args[1], args[2]);

        var products = productDao.searchProducts(userInput);

        products.stream().forEach(x -> System.out.println(x.toString()));
    }
}
