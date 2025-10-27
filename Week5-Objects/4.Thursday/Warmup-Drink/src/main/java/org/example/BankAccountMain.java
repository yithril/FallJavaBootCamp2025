package org.example;

public class BankAccountMain {
    public static void main(String[] args) {
        //We are going to create an INSTANCE of BankAccount
        BankAccount bankAccount = new BankAccount(100, "John Smith");
        BankAccount bankAccount1 = new BankAccount(200, "Bob");
        BankAccount bankAccount2 = new BankAccount(3000, "Somebody");

        //Static is for things that are universal or global
        //Not tied to the instance, its tied to the class
        //When calling a static method or property, you cannot use an instance/object
        //You must use the class
        System.out.println("The Swift code is: " + BankAccount.SwiftCode);
    }
}
