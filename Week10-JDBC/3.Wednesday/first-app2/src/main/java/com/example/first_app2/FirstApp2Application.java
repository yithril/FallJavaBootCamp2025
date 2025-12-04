package com.example.first_app2;

import com.example.first_app2.dao.CategoryDao;
import com.example.first_app2.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FirstApp2Application implements CommandLineRunner {

	@Autowired
	private CategoryDao categoryDao;

	public static void main(String[] args) {
		SpringApplication.run(FirstApp2Application.class, args);
	}

	@Override
	public void run(String... args){
		System.out.println("Categories from Northwind:");

		var categories = categoryDao.findAll();

		categories.stream().forEach(x -> System.out.println(x.toString()));
	}
}
