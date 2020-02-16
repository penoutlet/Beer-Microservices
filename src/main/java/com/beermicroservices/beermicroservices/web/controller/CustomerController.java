package com.beermicroservices.beermicroservices.web.controller;


import com.beermicroservices.beermicroservices.model.BeerDto;
import com.beermicroservices.beermicroservices.model.CustomerDto;
import com.beermicroservices.beermicroservices.web.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {


    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomerById(UUID customerId){
        return new ResponseEntity(BeerDto.builder().build(), HttpStatus.OK);
    }
}
