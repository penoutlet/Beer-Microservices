package com.beermicroservices.beermicroservices.web.services;


import com.beermicroservices.beermicroservices.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
