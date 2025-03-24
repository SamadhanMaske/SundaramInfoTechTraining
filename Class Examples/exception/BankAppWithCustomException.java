package com.exception;

//Custom checked exception for insufficient funds
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}

//Custom unchecked exception 
class InvalidAmountException extends RuntimeException {
 public InvalidAmountException(String message) {
     super(message);
 }
}

class BankAccount {
 private double balance;
 
 public BankAccount(double balance) {
     this.balance = balance;
 }
 
 public void withdraw(double amount) throws InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount cannot be negative or zero.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
     }
     balance -= amount;
 }
 
 // Returns the current balance
 public double getBalance() {
     return balance;
 }
}

public class BankAppWithCustomException {
 public static void main(String[] args) {
     BankAccount account = new BankAccount(500.0);

     // Negative withdrawal amount
     try {
         account.withdraw(-100);
     } catch (InvalidAmountException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     
     // Withdrawal amount greater than the account balance
     try {
         account.withdraw(600);
     } catch (InvalidAmountException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println("Exception: " + e.getMessage());
     }
     
     // Scenario 3: Successful withdrawal
     try {
         account.withdraw(300);
         System.out.println("Withdrawal successful. Remaining balance: " + account.getBalance());
     } catch (InvalidAmountException e) {
         System.out.println("Exception: " + e.getMessage());
     } catch (InsufficientFundsException e) {
         System.out.println("Exception: " + e.getMessage());
     }
 }
}


