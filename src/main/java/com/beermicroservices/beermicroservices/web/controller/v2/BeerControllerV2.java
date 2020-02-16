package com.beermicroservices.beermicroservices.web.controller.v2;

import com.beermicroservices.beermicroservices.model.BeerDto;
import com.beermicroservices.beermicroservices.web.services.BeerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {

    private final BeerService beerService;

    public BeerControllerV2(BeerService beerService)
    {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(UUID beerId)
    {
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody BeerDto beerDtoV2)
    {
        BeerDto newBeer = beerService.saveNewBeer(beerDtoV2);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "api/v1/beer" + newBeer.getId().toString());

        return new ResponseEntity(httpHeaders,HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity handleUpdate(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDtoV2)
    {

        beerService.updateBeer(beerId, beerDtoV2);

        // using response entity allows us more control over response content.
        // alternatively, we can use @ResponseStatus annotation
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeerById(beerId);
    }
}
