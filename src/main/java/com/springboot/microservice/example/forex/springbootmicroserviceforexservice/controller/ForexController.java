package com.springboot.microservice.example.forex.springbootmicroserviceforexservice.controller;

import com.springboot.microservice.example.forex.springbootmicroserviceforexservice.ExchangeValue;
import com.springboot.microservice.example.forex.springbootmicroserviceforexservice.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForexController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepository exchangeValueRepository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue (@PathVariable String from, @PathVariable String to){
        ExchangeValue exchangeValue = exchangeValueRepository.findByFromAndTo(from, to);
        return exchangeValue;
    }
}
