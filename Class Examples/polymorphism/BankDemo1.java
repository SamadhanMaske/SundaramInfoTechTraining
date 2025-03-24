package com.polymorphism;

class BankAccount {
    private static double interestRate;
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public static void setInterestRate(double rate) {
        if (rate > 0) {
            interestRate = rate;
        } else {
            System.out.println("Invalid interest rate.");
        }
    }

    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber +
                ", Holder: " + accountHolder +
                ", Balance: " + balance +
                ", Interest Rate: " + interestRate + "%");
    }
}

public class BankDemo1 {
    public static void main(String[] args) {
        BankAccount.setInterestRate(5.0); // Set the interest rate for all accounts

        BankAccount account1 = new BankAccount(101, "Alice", 5000.0);
        BankAccount account2 = new BankAccount(102, "Bob", 3000.0);

        // Deposit and withdraw some money
        account1.deposit(1000.0);
        account2.withdraw(500.0);

        // Change the interest rate using the static method
        BankAccount.setInterestRate(6);

        // Display the details of both accounts
        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}

