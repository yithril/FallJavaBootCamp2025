package com.example.first_api.mapper;

import com.example.first_api.dto.CreateRecipeDto;
import com.example.first_api.dto.RecipeDto;
import com.example.first_api.dto.UpdateRecipeDto;
import com.example.first_api.models.Recipe;

public final class RecipeMapper {

    private RecipeMapper() {}

    public static Recipe toEntity(CreateRecipeDto dto) {
        Recipe recipe = new Recipe();
        recipe.setName(dto.name());
        recipe.setInstructions(dto.instructions());
        recipe.setCookingTimeInMinutes(dto.cookingTimeInMinutes());
        return recipe;
    }

    public static void updateEntity(Recipe recipe, UpdateRecipeDto dto) {
        recipe.setName(dto.name());
        recipe.setInstructions(dto.instructions());
        recipe.setCookingTimeInMinutes(dto.cookingTimeInMinutes());
    }

    public static RecipeDto toDto(Recipe recipe) {
        return new RecipeDto(
                recipe.getId(),
                recipe.getName(),
                recipe.getInstructions(),
                recipe.getCookingTimeInMinutes(),
                recipe.getCreatedAt(),
                recipe.getUpdatedAt()
        );
    }
}
