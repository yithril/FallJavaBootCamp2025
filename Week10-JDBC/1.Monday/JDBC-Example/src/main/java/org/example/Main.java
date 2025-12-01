package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //print out all the categories from the database
        String dbUrl = args[0];
        String dbUser = args[1];
        String dbPassword = args[2];

        CategoryDao dao = new CategoryDao(dbUrl, dbUser, dbPassword);

        List<Category> categoryList = dao.getAllCategories();

        categoryList.stream().forEach(x -> System.out.println(x.toString()));
    }
}