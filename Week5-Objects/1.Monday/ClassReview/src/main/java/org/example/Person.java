package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //derived getter
    //Getter that combines 2 or more properties together
    public String getFullName(){
        return firstName + " " + lastName;
    }
}
