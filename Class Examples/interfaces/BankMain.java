package com.interfaces;

interface Bank {
    void deposit(double amount);
    void withdraw(double amount);
}

class SavingsAccount implements Bank {
    private double balance;

    SavingsAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(1000);
        account.deposit(500);
        account.withdraw(300);
        account.displayBalance();
    }
}
