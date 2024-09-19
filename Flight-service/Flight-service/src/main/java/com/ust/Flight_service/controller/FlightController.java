package com.ust.Flight_service.controller;

import com.ust.Flight_service.model.Flight;
import com.ust.Flight_service.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/flights")
public class FlightController {


    @Autowired
    private FlightService flightService;


    @PostMapping("/addflight")
    public Flight addFlight(@RequestBody String flight)
    {
        return flightService.addFlight(flight);
    }

}
