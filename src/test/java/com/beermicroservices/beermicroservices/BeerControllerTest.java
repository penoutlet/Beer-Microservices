package com.beermicroservices.beermicroservices;

import com.beermicroservices.beermicroservices.model.BeerDto;
import com.beermicroservices.beermicroservices.web.services.BeerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

public class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    BeerService beerService;

    BeerDto validBeer;

    @Test
    public void getBeer() throws Exception {
        given()
    }
}
