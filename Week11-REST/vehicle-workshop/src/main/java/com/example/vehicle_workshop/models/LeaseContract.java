package com.example.vehicle_workshop.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Entity
@Table(name = "lease_contracts")
public class LeaseContract extends Contract{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public LeaseContract(){

    }

    public LeaseContract(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
