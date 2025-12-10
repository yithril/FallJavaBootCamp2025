package com.example.first_api.services;

import com.example.first_api.dto.CreateRecipeDto;
import com.example.first_api.dto.RecipeDto;
import com.example.first_api.dto.RecipeSearchParams;
import com.example.first_api.dto.UpdateRecipeDto;
import com.example.first_api.exceptions.ResourceNotFoundException;
import com.example.first_api.mapper.RecipeMapper;
import com.example.first_api.models.Recipe;
import com.example.first_api.repositories.RecipeRepository;
import com.example.first_api.services.interfaces.RecipeService;
import com.example.first_api.specification.RecipeSpecifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public RecipeDto createRecipe(CreateRecipeDto dto) {
        Recipe recipe = RecipeMapper.toEntity(dto);
        Recipe saved = recipeRepository.save(recipe);
        return RecipeMapper.toDto(saved);
    }

    @Override
    public RecipeDto getRecipeById(Long id) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recipe", id));
        return RecipeMapper.toDto(recipe);
    }

    @Override
    public List<RecipeDto> getAllRecipes() {
        return recipeRepository.findAll()
                .stream()
                .map(RecipeMapper::toDto)
                .toList();
    }

    @Override
    public RecipeDto updateRecipe(Long id, UpdateRecipeDto dto) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Recipe", id));

        RecipeMapper.updateEntity(recipe, dto);
        Recipe updated = recipeRepository.save(recipe);

        return RecipeMapper.toDto(updated);
    }

    @Override
    public void deleteRecipe(Long id) {
        if (!recipeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Recipe", id);
        }
        recipeRepository.deleteById(id);
    }

    @Override
    public List<RecipeDto> searchRecipes(RecipeSearchParams params) {
        Specification<Recipe> spec = RecipeSpecifications.withFilters(params);

        return recipeRepository.findAll(spec)
                .stream()
                .map(RecipeMapper::toDto)
                .toList();
    }

    @Override
    public Page<RecipeDto> getPagedRecipes(Pageable pageable) {
        return recipeRepository.findAll(pageable)
                .map(RecipeMapper::toDto);
    }
}
