package com.example.first_api.services;

import com.example.first_api.models.Recipe;
import com.example.first_api.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
