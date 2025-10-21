package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Bob", "Jones", 50);

        System.out.println(person.getFullName());

        BankAccount bankAccount = new BankAccount("1234", 100);

        bankAccount.deposit(100);
        bankAccount.withdraw(50);
    }
}