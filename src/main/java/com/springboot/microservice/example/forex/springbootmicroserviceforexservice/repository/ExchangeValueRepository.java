package com.springboot.microservice.example.forex.springbootmicroserviceforexservice.repository;

import com.springboot.microservice.example.forex.springbootmicroserviceforexservice.ExchangeValue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {
    ExchangeValue findByFromAndTo(String from, String to);
}
