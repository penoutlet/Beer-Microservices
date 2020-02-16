package com.beermicroservices.beermicroservices.web.services;

import com.beermicroservices.beermicroservices.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId);
}
