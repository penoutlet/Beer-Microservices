package com.beermicroservices.beermicroservices.web.services;

import com.beermicroservices.beermicroservices.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(id).build();
    }


}
