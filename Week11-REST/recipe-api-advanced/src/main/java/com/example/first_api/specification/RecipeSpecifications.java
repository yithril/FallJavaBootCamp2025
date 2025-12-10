package com.example.first_api.specification;

import com.example.first_api.dto.RecipeSearchParams;
import com.example.first_api.models.Recipe;
import org.springframework.data.jpa.domain.Specification;

public final class RecipeSpecifications {

    private RecipeSpecifications() {
    }

    public static Specification<Recipe> withFilters(RecipeSearchParams params) {
        Specification<Recipe> spec = (root, query, cb) -> cb.conjunction();

        if (params.getName() != null && !params.getName().isBlank()) {
            spec = spec.and(nameContains(params.getName()));
        }

        if (params.getMinCookingTimeInMinutes() != null) {
            spec = spec.and(minCookingTime(params.getMinCookingTimeInMinutes()));
        }

        if (params.getMaxCookingTimeInMinutes() != null) {
            spec = spec.and(maxCookingTime(params.getMaxCookingTimeInMinutes()));
        }

        if (params.getInstructionsContains() != null && !params.getInstructionsContains().isBlank()) {
            spec = spec.and(instructionsContains(params.getInstructionsContains()));
        }

        return spec;
    }

    private static Specification<Recipe> nameContains(String name) {
        return (root, query, cb) ->
                cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
    }

    private static Specification<Recipe> minCookingTime(int minMinutes) {
        return (root, query, cb) ->
                cb.greaterThanOrEqualTo(root.get("cookingTimeInMinutes"), minMinutes);
    }

    private static Specification<Recipe> maxCookingTime(int maxMinutes) {
        return (root, query, cb) ->
                cb.lessThanOrEqualTo(root.get("cookingTimeInMinutes"), maxMinutes);
    }

    private static Specification<Recipe> instructionsContains(String text) {
        return (root, query, cb) ->
                cb.like(cb.lower(root.get("instructions")), "%" + text.toLowerCase() + "%");
    }
}
