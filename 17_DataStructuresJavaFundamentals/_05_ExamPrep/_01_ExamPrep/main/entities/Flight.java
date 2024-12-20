package entities;

import java.util.Objects;

public class Flight {
    private String id;
    private String number;
    private String origin;
    private String destination;
    private boolean isCompleted;
    private Airline airline;

    public Flight(String id, String number, String origin, String destination, boolean isCompleted) {
        this.id = id;
        this.number = number;
        this.origin = origin;
        this.destination = destination;
        this.isCompleted = isCompleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Airline getAirline() {
        return airline;
    }

    public Flight setAirline(Airline airline) {
        this.airline = airline;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return isCompleted == flight.isCompleted && Objects.equals(id, flight.id) && Objects.equals(number, flight.number) && Objects.equals(origin, flight.origin) && Objects.equals(destination, flight.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, origin, destination, isCompleted);
    }
}
