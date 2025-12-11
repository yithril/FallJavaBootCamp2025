package com.example.vehicle_workshop.controllers;

import com.example.vehicle_workshop.services.SalesContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sales")
public class SalesContractController {

    @Autowired
    private SalesContractService salesContractService;
}
