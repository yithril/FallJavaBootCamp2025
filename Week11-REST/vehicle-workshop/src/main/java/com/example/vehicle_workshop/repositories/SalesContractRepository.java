package com.example.vehicle_workshop.repositories;

import com.example.vehicle_workshop.models.SalesContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalesContractRepository extends JpaRepository<SalesContract, Long> {
}
