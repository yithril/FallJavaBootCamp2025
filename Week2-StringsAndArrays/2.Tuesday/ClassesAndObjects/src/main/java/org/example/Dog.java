package org.example;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private boolean isBarking;

    public Dog(String name, String breed, int age, boolean isBarking) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.isBarking = isBarking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBarking() {
        return isBarking;
    }

    public void setBarking(boolean barking) {
        isBarking = barking;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", isBarking=" + isBarking +
                '}';
    }
}
