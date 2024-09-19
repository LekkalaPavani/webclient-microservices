package com.ust.Flight_service.model;

public record Flight(
        Long id,
        String flightNumber,
        String airline,
        String departureLocation,
        String arrivalLocation,
        String departureTime,
        String arrivalTime,
        int duration,
        double price,
        String airlinecode
) { }
