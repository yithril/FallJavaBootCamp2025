package com.example.vehicle_workshop.repositories;

import com.example.vehicle_workshop.models.LeaseContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaseContractRepository extends JpaRepository<LeaseContract, Long> {
}
