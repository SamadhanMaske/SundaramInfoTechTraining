package com.interfaces;

interface Vehicle {
	int MAX_SPEED = 120; // Implicitly public, static, and final
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopping...");
    }
    
    public void displayMaxSpeed() {
        System.out.println("Max Speed: " + MAX_SPEED);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.displayMaxSpeed(); //It will not work for Vehicle myCar= new Car();
        myCar.start(); 
        myCar.stop();  
    }
}
