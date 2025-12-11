package com.example.vehicle_workshop.dto.vehicle;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public record CreateVehicleDto(
        @NotBlank
        String vin,

        @Positive
        int year,

        @NotBlank
        @Size(max = 25)
        String make,

        @NotBlank
        @Size(max = 25)
        String model,

        @NotBlank
        String color,

        @NotBlank
        String vehicleType,

        @PositiveOrZero
        int odometer,

        @Positive
        double price,

        @Positive
        int dealershipId
) {
}
