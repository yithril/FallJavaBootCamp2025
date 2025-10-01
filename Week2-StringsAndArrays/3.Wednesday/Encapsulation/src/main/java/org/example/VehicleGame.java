package org.example;

public class VehicleGame {
    public static void main(String[] args) {
        Helicopter heli = new Helicopter();
        System.out.println("Fuel: " + heli.getFuel());
        System.out.println("Passenger: " + heli.getPassenger());
    }
}
