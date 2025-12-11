package com.example.vehicle_workshop.services;

import com.example.vehicle_workshop.repositories.SalesContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesContractService {

    @Autowired
    private SalesContractRepository salesContractRepository;
}
