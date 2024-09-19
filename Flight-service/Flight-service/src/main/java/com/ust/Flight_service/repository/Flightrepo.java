package com.ust.Flight_service.repository;

import com.ust.Flight_service.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Flightrepo extends JpaRepository<Flight,Long> {
}
