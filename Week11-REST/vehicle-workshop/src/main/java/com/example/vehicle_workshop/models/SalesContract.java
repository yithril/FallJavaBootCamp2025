package com.example.vehicle_workshop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "sales_contracts")
public class SalesContract extends Contract{
    private boolean isFinanced;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public SalesContract(){

    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
