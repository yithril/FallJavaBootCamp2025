package com.example.first_api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CreateRecipeDto(
        @NotBlank(message = "Name must not be blank")
        String name,
        @NotBlank
        String instructions,
        @Positive
        int cookingTimeInMinutes,
        boolean isVegan

) { }
