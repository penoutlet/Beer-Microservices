package com.beermicroservices.beermicroservices.web.services;


import com.beermicroservices.beermicroservices.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);

    CustomerDto addNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);
}
