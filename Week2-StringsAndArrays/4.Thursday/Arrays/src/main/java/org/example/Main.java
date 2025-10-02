package org.example;

public class Main {
    public static void main(String[] args) {
        int[] studentGrades = new int[5];

        //we start counting the spaces in an array starting with 0
        //Java is a 0 index language
        //We can put a value in the array at a certain index
        studentGrades[0] = 89;
        studentGrades[1] = 100;
        studentGrades[2] = 70;
        studentGrades[3] = 85;
        studentGrades[4] = 50;

        //you can print the value of the array at a certain index
        System.out.println(studentGrades[2]);

        //arrays have a size (length)
        System.out.println(studentGrades.length);

        //looping through an array
        //There's two ways to do it
        //First way: You care about the index

        for(int i = 0; i < studentGrades.length; i++){
            System.out.println(studentGrades[i]);
        }

        //if you don't care about the index, there's a short way
        //enhanced for loop
        for(int grade : studentGrades){
            System.out.println(grade);
        }

        ///Array of objects!
        Person[] people = new Person[4];

        people[0] = new Person("Shamar", 27);
        people[1] = new Person("Bob", 35);
        people[2] = new Person("Joe", 102);
        people[3] = new Person("Terry", 21);

        //Pro Tip: Enhanced For Loops are GREAT with objects!
        for(Person customer : people){
            System.out.println("Full name: " + customer.getFullName());
        }
    }
}