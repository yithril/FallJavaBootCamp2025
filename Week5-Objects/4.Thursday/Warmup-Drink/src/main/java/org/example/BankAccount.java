package org.example;

public class BankAccount {
    private double balance;
    private String name;

    //static property
    public static String SwiftCode = "ABC123";

    public BankAccount(double balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
