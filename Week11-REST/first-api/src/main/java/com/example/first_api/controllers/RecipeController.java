package com.example.first_api.controllers;

import com.example.first_api.models.Recipe;
import com.example.first_api.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// endpoint is going to be /recipe
//Request Mapping means everything in this controller starts with /recipe
//So I don't have to type it over and over
//Don't forget the slash
@RestController
@RequestMapping("/recipe")
public class RecipeController {
    //This is the other way you can do dependency injection
    //Which is better? Nothing you need to care about now
    //In this example, autowired goes on the CONSTRUCTOR
    //Technically, autowired is optional here
    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService){
        this.recipeService = recipeService;
    }

    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes(){
        var recipes = this.recipeService.getAllRecipes();

        //We need to return the recipes in JSON format with a status code
        return new ResponseEntity<>(recipes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable Long id){
        //Maybe we find the recipe, or maybe don't
        Optional<Recipe> recipe = this.recipeService.getRecipeById(id);

        //We found the recipe, it's present, here it is with a 200
        if(recipe.isPresent()){
            return new ResponseEntity<>(recipe.get(), HttpStatus.OK);
        }
        else{
            //Didn't find it, here's a 404
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long id){
        boolean isDeleted = this.recipeService.deleteRecipe(id);

        //204 NO CONTENT
        if(isDeleted){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
