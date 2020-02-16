package com.beermicroservices.beermicroservices.web.services.v2;

import com.beermicroservices.beermicroservices.model.BeerDto;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDtoV2);

    void updateBeer(UUID beerId, BeerDto beerDtoV2);

    void deleteBeerById(UUID beerId);
}
