package com.ust.Flight_service.service;


import com.ust.Flight_service.model.Flight;
import com.ust.Flight_service.repository.Flightrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {

    @Autowired
    private Flightrepo flightrepo;

    public Flight addFlight(String flight) {
      return flightrepo.save(flight);
    }
}
