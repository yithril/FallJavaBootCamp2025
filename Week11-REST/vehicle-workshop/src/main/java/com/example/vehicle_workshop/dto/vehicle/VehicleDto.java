package com.example.vehicle_workshop.dto.vehicle;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record VehicleDto(
        String vin,

        int year,

        String make,

        String model,

        String color,

        String vehicleType,

        int odometer,

        double price
) { }
