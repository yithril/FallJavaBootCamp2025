package org.example;

public class Person {
    //properties
    private String name;
    private int age;
    private double weight;
    private boolean isEmployed;
    //This is the constructor
    public Person(String name, int age, double weight, boolean isEmployed){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isEmployed = isEmployed;
    }

    //getter
    public String getName(){
        return this.name;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }

    //getter for age
    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
