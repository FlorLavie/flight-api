package Ultimaentrega.FlightApi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String origin;
    private String destiny;
    private String departureTime;
    private String arrivingTime;
    private Double price;
    private String frequency;

    public Flight( String origin, String destiny, String departureTime, String arrivingTime, Double price, String frequency) {

        this.origin = origin;
        this.destiny = destiny;
        this.departureTime = departureTime;
        this.arrivingTime = arrivingTime;
        this.price = price;
        this.frequency = frequency;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestiny(String destiny) {
        this.destiny = destiny;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivingTime(String arrivingTime) {
        this.arrivingTime = arrivingTime;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public Long getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivingTime() {
        return arrivingTime;
    }

    public Double getPrice() {
        return price;
    }

    public String getFrequency() {
        return frequency;
    }
}