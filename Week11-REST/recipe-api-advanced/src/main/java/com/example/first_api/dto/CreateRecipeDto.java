package com.example.first_api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CreateRecipeDto(
        @NotBlank @Size(max = 100) String name,
        @NotBlank String instructions,
        @Min(1) int cookingTimeInMinutes
) {}
