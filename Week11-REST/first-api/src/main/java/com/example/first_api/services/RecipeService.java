package com.example.first_api.services;

import com.example.first_api.dto.CreateRecipeDto;
import com.example.first_api.dto.UpdateRecipeDto;
import com.example.first_api.models.Recipe;
import com.example.first_api.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {
    //The Service calls the Repository
    //The repository is a dependency of the service
    @Autowired
    private RecipeRepository recipeRepository;

    //Get All Recipes
    public List<Recipe> getAllRecipes(){
        var recipes = recipeRepository.findAll();

        return recipes;
    }

    public Optional<Recipe> getRecipeById(Long id){
        Optional<Recipe> recipe = recipeRepository.findById(id);

        return recipe;
    }

    public boolean deleteRecipe(Long id){
        if (!recipeRepository.existsById(id)) {
            return false;
        }

        recipeRepository.deleteById(id);
        return true;
    }

    public Recipe createRecipe(CreateRecipeDto dto){
        Recipe recipe = new Recipe();
        recipe.setName(dto.name());
        recipe.setInstructions(dto.instructions());
        recipe.setCookingTimeInMinutes(dto.cookingTimeInMinutes());
        recipe.setVegan(dto.isVegan());

        recipe.setCreatedAt(LocalDateTime.now());

        recipeRepository.save(recipe);

        return recipe;
    }

    public Recipe updateRecipe(UpdateRecipeDto dto, Long id){
        //does the recipe even exist?
        var existingRecipe = recipeRepository.findById(id);

        if(existingRecipe.isPresent()){
            Recipe recipe = existingRecipe.get();
            recipe.setInstructions(dto.instructions());
            recipe.setCookingTimeInMinutes(dto.cookingTimeInMinutes());

            //once you finish updating whatever you're allowed to update
            recipeRepository.save(recipe);

            return recipe;
        }
        else{
            return null;
        }
    }

    public List<Recipe> searchRecipe(String name){
        var recipes = recipeRepository.findByNameContainingIgnoreCase(name);

        return recipes;
    }

    public List<Recipe> searchRecipeByInstructions(String instructions){
        return recipeRepository.findByInstructionsContainingIgnoreCase(instructions);
    }
}
