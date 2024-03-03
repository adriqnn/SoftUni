package structures;

import entities.Airline;
import entities.Flight;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirlinesManagerImpl implements AirlinesManager {
    private Map<String, Airline> airlines;
    private Map<String, Flight> flights;
    private Map<String, Flight> completed;
    private Map<Airline, List<Flight>> airlineFlightsMap;

    public AirlinesManagerImpl() {
        this.airlines = new LinkedHashMap<>();
        this.flights = new LinkedHashMap<>();
        this.completed = new HashMap<>();
        this.airlineFlightsMap = new HashMap<>();
    }

    @Override
    public void addAirline(Airline airline) {
        this.airlines.putIfAbsent(airline.getId(), airline);
        this.airlineFlightsMap.put(airline, new ArrayList<>());
    }

    @Override
    public void addFlight(Airline airline, Flight flight) {
        if(!contains(airline)){
            throw new IllegalArgumentException();
        }

        flight.setAirline(airline);
        
        this.airlines.get(airline.getId()).getFlights().putIfAbsent(flight.getId(), flight);
        this.flights.putIfAbsent(flight.getId(), flight);
        this.airlineFlightsMap.get(airline).add(flight);

        if (flight.isCompleted()) {
            this.completed.put(flight.getId(), flight);
        }
    }

    @Override
    public boolean contains(Airline airline) {
        return this.airlines.containsKey(airline.getId());
    }

    @Override
    public boolean contains(Flight flight) {
        return this.flights.containsKey(flight.getId());
    }

    @Override
    public void deleteAirline(Airline airline) throws IllegalArgumentException {
        if(!contains(airline)){
            throw new IllegalArgumentException();
        }

        Collection<Flight> flights = airline.getFlights().values();

        for (Flight flight : flights) {
            this.flights.remove(flight.getId());
            this.completed.remove(flight.getId());
        }

        this.airlines.remove(airline.getId());

        List<Flight> flightsOfAirline = this.airlineFlightsMap.get(airline);
        this.airlineFlightsMap.remove(airline);
//        this.flights = flights.entrySet().stream().filter(entry -> entry.getValue().getAirline().getId().equals(airline.getId()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    @Override
    public Iterable<Flight> getAllFlights() {
        return this.flights.values();
    }

    @Override
    public Flight performFlight(Airline airline, Flight flight) throws IllegalArgumentException {
        if(!contains(airline) || !contains(flight)){
            throw new IllegalArgumentException();
        }

        flight.setAirline(airline).setCompleted(true);
        this.flights.put(flight.getId(), flight);
        this.airlines.get(airline.getId()).getFlights().put(flight.getId(), flight);
        this.completed.put(flight.getId(), flight);

        return flight;
    }

    @Override
    public Iterable<Flight> getCompletedFlights() {
        return this.completed.values();
    }

    @Override
    public Iterable<Flight> getFlightsOrderedByNumberThenByCompletion() {
        List<Flight> uncompleted = this.flights.values().stream().filter(e -> !e.isCompleted()).sorted(Comparator.comparing(Flight::getNumber)).collect(Collectors.toList());
        List<Flight> completed = this.flights.values().stream().filter(Flight::isCompleted).sorted(Comparator.comparing(Flight::getNumber)).collect(Collectors.toList());

        uncompleted.addAll(completed);

        return uncompleted;
    }

    @Override
    public Iterable<Airline> getAirlinesOrderedByRatingThenByCountOfFlightsThenByName() {
        return this.airlineFlightsMap.entrySet().stream().sorted((a1, a2) -> {
            int result = Double.compare(a2.getKey().getRating(), a1.getKey().getRating());

            if(result == 0){
                result = Integer.compare(a2.getValue().size(), a1.getValue().size());

                if(result == 0){
                    result = a1.getKey().getName().compareTo(a2.getKey().getName());
                }
            }
            
            return result;
        }).map(Map.Entry::getKey).collect(Collectors.toList());
    }

    @Override
    public Iterable<Airline> getAirlinesWithFlightsFromOriginToDestination(String origin, String destination) {
        return this.airlines.values().stream()
                .filter(e -> e.getFlights().values().stream().filter(f -> f.getDestination().equals(destination) && f.getOrigin().equals(origin) && !f.isCompleted()).collect(Collectors.toList()).size() > 0)
                .collect(Collectors.toList());
    }
}
