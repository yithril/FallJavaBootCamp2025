//declaring classes is similar
//public and private and protected arent the same thing
//think of everything as public
class Person {
    constructor(name, age, occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
}

let person = new Person("Bob", 25, "Software Engineer");

//BIG difference with Java
person.city = "Paris";

//What if I don't want to write a class, I just an object?

let car = {
    make: "Dodge",
    model: "Charger",
    whateverIwant: true
}

//Are there interfaces and abstract classes
//No.

class Dog extends Animal {

}

//person.makeUpAMethodOutOFThinAir(true);

