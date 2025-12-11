package com.example.first_api.dto;

import java.time.Instant;
import java.time.LocalDateTime;

public record RecipeDto(
        Long id,
        String name,
        String instructions,
        int cookingTimeInMinutes,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {}
