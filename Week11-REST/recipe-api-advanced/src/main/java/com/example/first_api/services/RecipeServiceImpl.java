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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class RecipeServiceImpl implements RecipeService {

    private static final Logger log = LoggerFactory.getLogger(RecipeServiceImpl.class);

    private final RecipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public RecipeDto createRecipe(CreateRecipeDto dto) {
        log.info("Creating new recipe: {}", dto.name());
        Recipe recipe = RecipeMapper.toEntity(dto);
        Recipe saved = recipeRepository.save(recipe);
        log.info("Created recipe with id={}", saved.getId());
        return RecipeMapper.toDto(saved);
    }

    @Override
    public RecipeDto getRecipeById(Long id) {
        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Recipe not found: id={}", id);
                    return new ResourceNotFoundException("Recipe", id);
                });

        return RecipeMapper.toDto(recipe);
    }

    @Override
    public List<RecipeDto> getAllRecipes() {
        // No log needed: this is a simple read operation.
        return recipeRepository.findAll()
                .stream()
                .map(RecipeMapper::toDto)
                .toList();
    }

    @Override
    public RecipeDto updateRecipe(Long id, UpdateRecipeDto dto) {
        log.info("Updating recipe id={}", id);

        Recipe recipe = recipeRepository.findById(id)
                .orElseThrow(() -> {
                    log.warn("Cannot update; recipe not found: id={}", id);
                    return new ResourceNotFoundException("Recipe", id);
                });

        RecipeMapper.updateEntity(recipe, dto);
        Recipe updated = recipeRepository.save(recipe);

        log.info("Updated recipe id={}", id);
        return RecipeMapper.toDto(updated);
    }

    @Override
    public void deleteRecipe(Long id) {
        log.info("Deleting recipe id={}", id);

        if (!recipeRepository.existsById(id)) {
            log.warn("Cannot delete; recipe not found: id={}", id);
            throw new ResourceNotFoundException("Recipe", id);
        }

        recipeRepository.deleteById(id);
        log.info("Deleted recipe id={}", id);
    }

    @Override
    public List<RecipeDto> searchRecipes(RecipeSearchParams params) {
        log.info("Searching recipes with filters: name='{}', minTime={}, maxTime={}, instructions='{}'",
                params.getName(),
                params.getMinCookingTimeInMinutes(),
                params.getMaxCookingTimeInMinutes(),
                params.getInstructionsContains());

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
