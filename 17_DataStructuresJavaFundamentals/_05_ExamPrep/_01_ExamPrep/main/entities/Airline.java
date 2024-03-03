package entities;

import java.util.*;

public class Airline {
    private String id;
    private String name;
    private double rating;
    private Map<String, Flight> flights = new LinkedHashMap<>();

    public Airline(String id, String name, double rating) {
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Map<String, Flight> getFlights() {
        return flights;
    }

    public Airline setFlights(Map<String, Flight> flights) {
        this.flights = flights;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Double.compare(airline.rating, rating) == 0 && Objects.equals(id, airline.id) && Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rating);
    }
}
