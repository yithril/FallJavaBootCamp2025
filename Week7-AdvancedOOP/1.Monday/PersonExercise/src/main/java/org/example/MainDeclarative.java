package org.example;

import java.util.List;

public class MainDeclarative {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Emily", "Johnson", 24),
                new Person("Michael", "Anderson", 31),
                new Person("Sophia", "Martinez", 27),
                new Person("James", "Thompson", 45),
                new Person("Emily", "Carter", 22),
                new Person("Daniel", "Brown", 36),
                new Person("Olivia", "White", 19),
                new Person("Jacob", "Davis", 28),
                new Person("Ava", "Robinson", 33),
                new Person("Ethan", "Clark", 41),
                new Person("Isabella", "Rodriguez", 26),
                new Person("Liam", "Walker", 30),
                new Person("Sophia", "Hernandez", 38),
                new Person("Noah", "Lewis", 29),
                new Person("Mason", "Hall", 43),
                new Person("Mia", "Allen", 21),
                new Person("James", "Young", 34),
                new Person("Charlotte", "King", 25),
                new Person("Aiden", "Scott", 37),
                new Person("Olivia", "Adams", 32)
        );

        //Streams are for declarative Java
        //Loop through all the people in the list and their print their info out
        //Lambda
        people.stream().forEach(x -> System.out.println(x.toString()));

        //streams are powerful for filtering
        //Print out all the people whose last name begins with A
        var personList = people.stream()
                .filter(person -> person.getLastName().startsWith("A"))
                .toList();

        //displayPeople(personList);

        //All the people who are 21 and over.
        var personList2 = people.stream()
                .filter(person -> person.getAge() >= 21)
                .toList();

        //displayPeople(personList2);

        //All the people who are between 29 and 40 inclusive
        var personList3 = people.stream()
                .filter(person -> person.getAge() >= 29 && person.getAge() <= 40)
                .toList();

        //displayPeople(personList3);

        //All the people whose first name starts with D AND between 29 and 40
        //You can use AND && and OR || as many times as you want
        var personList4 = people.stream()
                .filter(person -> person.getAge() >= 29 && person.getAge() <= 40
                        && person.getFirstName().startsWith("D"))
                .toList();

        displayPeople(personList4);

        //All the people whose name is David
        var personList5 = people.stream()
                .filter(person -> person.getFirstName().equalsIgnoreCase("David"))
                .toList();

        //aggregates
        //HOW MANY people are over the age of 50
        var ageCount = people.stream()
                .filter(p -> p.getAge() > 50)
                .count();
        //System.out.println("There are " + ageCount + " people over 50 years old");

        //Before we can do the other aggregates, lets learn map
        //Average age of all people
        var averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average();

        //I want a list of all first names
        var firstNameList = people.stream()
                .map(x -> x.getFirstName())
                .toList();

        firstNameList.stream().forEach(x -> System.out.println(x));

        //What is the age of the oldest person
        var oldestAge = people.stream()
                .mapToInt(Person::getAge)
                .max().orElse(0);
        System.out.println("The oldest age is: " + oldestAge);
    }

    public static void displayPeople(List<Person> people){
        people.stream().forEach(x -> System.out.println(x.toString()));
    }


    public void getSum(){
        List<Integer> integerList = List.of(5, 10, 2, 34, 8, 100);

        //using a for loop
        int sum = 0;
        for(Integer num : integerList){
            sum += num;
        }

        var sum2 = integerList.stream().reduce(0, (temp, num) -> temp += num);
    }
}
