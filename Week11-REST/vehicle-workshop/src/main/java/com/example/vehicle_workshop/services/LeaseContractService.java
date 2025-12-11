package com.example.vehicle_workshop.services;

import com.example.vehicle_workshop.repositories.LeaseContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaseContractService {

    @Autowired
    private LeaseContractRepository leaseContractRepository;
}
