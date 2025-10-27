package org.example;

public class Main {
    public static void main(String[] args) {
        Dog fido = new Dog("Fido", 2, "golden", "labrador");
        fido.setName("Fido");
        fido.eat("dog food");
        fido.bark();

        Cat mittens = new Cat("Mittens", 5, "grey");
        mittens.setName("Mittens");
        mittens.eat("cat food");
        mittens.meow();
    }
}