package com.example.vehicle_workshop.controllers;

import com.example.vehicle_workshop.services.LeaseContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/lease")
public class LeaseContractController {

    @Autowired
    private LeaseContractService leaseContractService;
}
