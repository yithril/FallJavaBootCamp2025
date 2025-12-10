package com.example.first_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record UpdateRecipeDto(
        @NotBlank
        String instructions,
        @Positive
        int cookingTimeInMinutes
) { }
