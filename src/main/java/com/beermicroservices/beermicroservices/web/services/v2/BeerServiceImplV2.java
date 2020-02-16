package com.beermicroservices.beermicroservices.web.services.v2;

import com.beermicroservices.beermicroservices.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDtoV2) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDtoV2) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {

    }
}
