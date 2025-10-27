package org.example;

public class Dog extends Animal{
    private String breed;
    public Dog(String name, int age, String color, String breed){
        super(name, age, color);
        this.breed = breed;
    }
    public void bark(){
        System.out.println("Woof!");
    }
}
