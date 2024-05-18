package Ultimaentrega.FlightApi.service;

import Ultimaentrega.FlightApi.model.Flight;
import Ultimaentrega.FlightApi.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class FlightService {

    @Autowired
    FlightRepository flightRepository;

    // traer todos los vuelos
     public List<Flight> getAll(){
        return flightRepository.findAll();
     }

     //crear vuelo
    public void createFlight(Flight flight){
         flightRepository.save(flight);

    }

    //update vuelo
    public Flight updateFlights(Flight flight){
         flightRepository.save(flight);
         return flightRepository.findById(flight.getId()).orElse(null);

    }

    // buscar vuelo por id
    public Flight findFlightID(Long id){
        return flightRepository.findById(id).orElse(null);
    }

    // Borrar vuelo
    public void deleteFlight(long id){
        flightRepository.deleteById(id);
    }



}

