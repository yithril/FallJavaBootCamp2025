package com.example.first_api.dto;

public class RecipeSearchParams {

    private String name;
    private Integer minCookingTimeInMinutes;
    private Integer maxCookingTimeInMinutes;
    private String instructionsContains;

    public RecipeSearchParams() {
    }

    public String getName() {
        return name;
    }

    public Integer getMinCookingTimeInMinutes() {
        return minCookingTimeInMinutes;
    }

    public Integer getMaxCookingTimeInMinutes() {
        return maxCookingTimeInMinutes;
    }

    public String getInstructionsContains() {
        return instructionsContains;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMinCookingTimeInMinutes(Integer minCookingTimeInMinutes) {
        this.minCookingTimeInMinutes = minCookingTimeInMinutes;
    }

    public void setMaxCookingTimeInMinutes(Integer maxCookingTimeInMinutes) {
        this.maxCookingTimeInMinutes = maxCookingTimeInMinutes;
    }

    public void setInstructionsContains(String instructionsContains) {
        this.instructionsContains = instructionsContains;
    }
}
