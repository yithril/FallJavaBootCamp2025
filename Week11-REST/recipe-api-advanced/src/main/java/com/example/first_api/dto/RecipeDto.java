package com.example.first_api.dto;

import java.time.Instant;

public record RecipeDto(
        Long id,
        String name,
        String instructions,
        int cookingTimeInMinutes,
        Instant createdAt,
        Instant updatedAt
) {}
