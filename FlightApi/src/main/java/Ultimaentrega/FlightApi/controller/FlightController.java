package Ultimaentrega.FlightApi.controller;

import Ultimaentrega.FlightApi.model.Flight;
import Ultimaentrega.FlightApi.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/flights")
public class FlightController {

    @Autowired
    FlightService flightService;

    // Traer todos los vuelos
    @GetMapping("/all")
    public List<Flight> getAllFlights () {
        return flightService.getAll();
    }


    // Buscar vuelo por id
    @GetMapping("/{id}")
    public Flight findflightID(@PathVariable Long id){

       return flightService.findFlightID(id);

    }

    // crear vuelo
    @PostMapping("/create")
    public void createFlight(@RequestBody Flight flight){
        flightService.createFlight(flight);
    }

    // update vuelo
    @PutMapping("/update")
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlights(flight);
    }


    // Borrar vuelo
    @DeleteMapping("/delete")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteFlight(id);
    }
}
