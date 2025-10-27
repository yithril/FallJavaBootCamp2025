package org.example;

public class Cat extends Animal{
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public void meow(){
        System.out.println("Meow!");
    }
}
