package com.interfaces;

interface Payment {
 void processPayment(double amount);
 String getPaymentMethod();
}

class CreditCardPayment implements Payment {
 public void processPayment(double amount) {
     System.out.println("Processing credit card payment of $" + amount);
 }

 public String getPaymentMethod() {
     return "Credit Card";
 }
}

class PayPalPayment implements Payment {
 public void processPayment(double amount) {
     System.out.println("Processing PayPal payment of $" + amount);
 }

 public String getPaymentMethod() {
     return "PayPal";
 }
}

class BankTransferPayment implements Payment {
 public void processPayment(double amount) {
     System.out.println("Processing bank transfer payment of $" + amount);
 }

 public String getPaymentMethod() {
     return "Bank Transfer";
 }
}

public class PaymentDemo {
	public static void processPayment(Payment p, double amount) {
		p.processPayment(amount);
		String pm = p.getPaymentMethod();	
		System.out.println("Payment method: "+pm);
	}

	 public static void main(String[] args) {
	     Payment creditCardPayment = new CreditCardPayment();
	     Payment payPalPayment = new PayPalPayment();
	     Payment bankTransferPayment = new BankTransferPayment();

	     // Process payments using different methods
	     processPayment(creditCardPayment, 100.0);
	     processPayment(payPalPayment, 200.0);
	     processPayment(bankTransferPayment, 300.0);

	 }
}

