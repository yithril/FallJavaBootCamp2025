package com.example.vehicle_workshop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;

@MappedSuperclass
public abstract class Contract extends Auditable {

    @FutureOrPresent
    private LocalDate date;

    @NotBlank
    private String name;

    @Email
    private String email;

    @ManyToOne
    @JoinColumn(name = "vin")
    private Vehicle vehicle;

    @Positive
    private double totalPrice;

    @PositiveOrZero
    private double monthlyPayment;

    public @FutureOrPresent LocalDate getDate() {
        return date;
    }

    public void setDate(@FutureOrPresent LocalDate date) {
        this.date = date;
    }

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @Email String getEmail() {
        return email;
    }

    public void setEmail(@Email String email) {
        this.email = email;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Positive
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(@Positive double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @PositiveOrZero
    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(@PositiveOrZero double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}
