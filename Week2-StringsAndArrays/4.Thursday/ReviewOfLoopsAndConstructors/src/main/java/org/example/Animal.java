package org.example;

public class Animal {
    private String species;
    private String color;
    private String biome;

    //constructor
    //parameterless constructor, no args, blank args
    public Animal(String species, String color){
        this.species = species;
        this.color = color;
        this.biome = "Jungle";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBiome() {
        return biome;
    }

    public void setBiome(String biome) {
        this.biome = biome;
    }

    //overrides

    @Override
    public String toString() {
        return "Animal: " +
                "species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", biome='" + biome + '\'' +
                "----";
    }
}
