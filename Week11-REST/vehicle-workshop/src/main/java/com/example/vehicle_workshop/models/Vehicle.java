package com.example.vehicle_workshop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "vehicles")
public class Vehicle extends Auditable{
    @Id
    private String vin;

    @Positive
    private int year;

    @NotBlank
    @Size(max = 25)
    private String make;

    @NotBlank
    @Size(max = 25)
    private String model;

    @NotBlank
    private String color;

    @NotBlank
    private String vehicleType;

    @PositiveOrZero
    private int odometer;

    @Positive
    private double price;

    @ManyToOne
    @JoinColumn(name = "dealership_id")
    private Dealership dealership;

    public Vehicle(){

    }

    public Vehicle(String vin, int year, String make, String model, String color, String vehicleType, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vehicleType = vehicleType;
        this.odometer = odometer;
        this.price = price;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Positive
    public int getYear() {
        return year;
    }

    public void setYear(@Positive int year) {
        this.year = year;
    }

    public @NotBlank @Size(max = 25) String getMake() {
        return make;
    }

    public void setMake(@NotBlank @Size(max = 25) String make) {
        this.make = make;
    }

    public @NotBlank @Size(max = 25) String getModel() {
        return model;
    }

    public void setModel(@NotBlank @Size(max = 25) String model) {
        this.model = model;
    }

    public @NotBlank String getColor() {
        return color;
    }

    public void setColor(@NotBlank String color) {
        this.color = color;
    }

    public @NotBlank String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(@NotBlank String vehicleType) {
        this.vehicleType = vehicleType;
    }

    @PositiveOrZero
    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(@PositiveOrZero int odometer) {
        this.odometer = odometer;
    }

    @Positive
    public double getPrice() {
        return price;
    }

    public void setPrice(@Positive double price) {
        this.price = price;
    }

    public Dealership getDealership() {
        return dealership;
    }

    public void setDealership(Dealership dealership) {
        this.dealership = dealership;
    }
}
