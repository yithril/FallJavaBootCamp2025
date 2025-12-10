package com.example.first_api.services.interfaces;

import com.example.first_api.dto.CreateRecipeDto;
import com.example.first_api.dto.RecipeDto;
import com.example.first_api.dto.RecipeSearchParams;
import com.example.first_api.dto.UpdateRecipeDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RecipeService {
    RecipeDto createRecipe(CreateRecipeDto dto);

    RecipeDto getRecipeById(Long id);

    List<RecipeDto> getAllRecipes();

    RecipeDto updateRecipe(Long id, UpdateRecipeDto dto);

    void deleteRecipe(Long id);

    List<RecipeDto> searchRecipes(RecipeSearchParams params);

    Page<RecipeDto> getPagedRecipes(Pageable pageable);
}
