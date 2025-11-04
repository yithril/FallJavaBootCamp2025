package org.example;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //null
        Optional<Person> person =
                Optional.of(new Person("Bob", "Jones", 25));

        //check if the box is empty
        if(person.isEmpty()){

        }

        //Get the person out of the box
        var actualPerson = person.get();
    }
}
