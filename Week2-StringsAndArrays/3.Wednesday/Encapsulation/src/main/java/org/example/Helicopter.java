package org.example;

public class Helicopter {
    private int fuel = 100;
    //"" with nothing in them is called a blank string
    private String passenger = "";

    //parameterless constructor
    public Helicopter(){

    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getPassenger() {
        return passenger;
    }

    public void setPassenger(String passenger) {
        this.passenger = passenger;
    }
}
