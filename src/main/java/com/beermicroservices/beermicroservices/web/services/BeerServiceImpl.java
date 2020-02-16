package com.beermicroservices.beermicroservices.web.services;

import com.beermicroservices.beermicroservices.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Sweet Chicken")
                .beerStyle("Lager")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
      return BeerDto.builder().id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {

    }

    @Override
    public void deleteBeerById(UUID beerId) {

    }
}
