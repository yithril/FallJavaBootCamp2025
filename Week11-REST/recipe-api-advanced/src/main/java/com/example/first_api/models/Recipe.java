package com.example.first_api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Lob
    @Column(nullable = false)
    private String instructions;

    @Column(nullable = false)
    private int cookingTimeInMinutes;

    public Recipe() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getInstructions() {
        return instructions;
    }

    public int getCookingTimeInMinutes() {
        return cookingTimeInMinutes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public void setCookingTimeInMinutes(int minutes) {
        this.cookingTimeInMinutes = minutes;
    }
}
