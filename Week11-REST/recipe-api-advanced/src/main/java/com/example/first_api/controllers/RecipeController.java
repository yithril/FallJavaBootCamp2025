package com.example.first_api.controllers;

import com.example.first_api.dto.CreateRecipeDto;
import com.example.first_api.dto.RecipeDto;
import com.example.first_api.dto.RecipeSearchParams;
import com.example.first_api.dto.UpdateRecipeDto;
import com.example.first_api.services.interfaces.RecipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private final RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RecipeDto> getRecipeById(@PathVariable Long id) {
        RecipeDto recipe = recipeService.getRecipeById(id);
        return ResponseEntity.ok(recipe);
    }

    @GetMapping
    public ResponseEntity<List<RecipeDto>> getAllRecipes() {
        List<RecipeDto> recipes = recipeService.getAllRecipes();
        return ResponseEntity.ok(recipes);
    }

    @GetMapping("/search")
    public ResponseEntity<List<RecipeDto>> searchRecipes(@ModelAttribute RecipeSearchParams params) {
        List<RecipeDto> results = recipeService.searchRecipes(params);
        return ResponseEntity.ok(results);
    }

    //Technically you could combine search/getAll/paged into one endpoint

    @GetMapping("/paged")
    public ResponseEntity<Page<RecipeDto>> getPagedRecipes(Pageable pageable) {
        Page<RecipeDto> page = recipeService.getPagedRecipes(pageable);
        return ResponseEntity.ok(page);
    }

    @PostMapping
    public ResponseEntity<RecipeDto> createRecipe(@Valid @RequestBody CreateRecipeDto dto) {
        RecipeDto created = recipeService.createRecipe(dto);

        // Location: /api/recipes/{id}
        URI location = URI.create("/api/recipes/" + created.id());

        return ResponseEntity
                .created(location)
                .body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<RecipeDto> updateRecipe(
            @PathVariable Long id,
            @Valid @RequestBody UpdateRecipeDto dto
    ) {
        RecipeDto updated = recipeService.updateRecipe(id, dto);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Long id) {
        recipeService.deleteRecipe(id);
        return ResponseEntity.noContent().build();
    }
}
