package com.interfaces;

interface Vehicle2 {
    void start();
    
    default void fuelType() {
        System.out.println("Petrol or Diesel");
    }
    
    static void displayMessage() {
        System.out.println("Static method in Interface");
    }
}

class Car2 implements Vehicle2 {
	
    public void start() {
        System.out.println("Car is starting...");
    }
}

public class InterfaceWIthDeafaultAndStatic {

	public static void main(String[] args) {
		Car2 myCar = new Car2();
        myCar.start();     
        myCar.fuelType();  
        Vehicle2.displayMessage();
	}

}
