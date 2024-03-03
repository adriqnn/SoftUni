package tripadministratorjava;

import java.util.*;
import java.util.stream.Collectors;

public class TripAdministratorImpl implements TripAdministrator {
    private Map<String, Company> companiesByName;
    private Map<String, Trip> tripsByIds;
    private Map<String, List<Trip>> companiesWithTrip;

    public TripAdministratorImpl(){
        this.companiesByName = new LinkedHashMap<>();
        this.tripsByIds = new LinkedHashMap<>();
        this.companiesWithTrip = new LinkedHashMap<>();
    }

    @Override
    public void addCompany(Company c) {
        if(this.companiesByName.containsKey(c.name)){
            throw new IllegalArgumentException();
        }

        this.companiesWithTrip.putIfAbsent(c.name, new ArrayList<>());
        this.companiesByName.putIfAbsent(c.name, c);
    }

    @Override
    public void addTrip(Company c, Trip t) {
        if(!this.companiesByName.containsKey(c.name) || exist(t)){
            throw new IllegalArgumentException();
        }

        if(companiesByName.get(c.name).tripOrganizationLimit == this.companiesWithTrip.get(c.name).size()){
            throw new IllegalArgumentException();
        }

        this.companiesWithTrip.get(c.name).add(t);
        this.tripsByIds.putIfAbsent(t.id, t);
    }

    @Override
    public boolean exist(Company c) {
        return this.companiesByName.containsKey(c.name);
    }

    @Override
    public boolean exist(Trip t) {
        return this.tripsByIds.containsKey(t.id);
    }

    @Override
    public void removeCompany(Company c) {
        if(!this.companiesByName.containsKey(c.name)){
            throw new IllegalArgumentException();
        }

        this.companiesByName.remove(c.name);
        List<Trip> trips = this.companiesWithTrip.remove(c.name);
        trips.forEach(e -> this.tripsByIds.remove(e.id));
    }

    @Override
    public Collection<Company> getCompanies() {
        return this.companiesByName.values();
    }

    @Override
    public Collection<Trip> getTrips() {
        return this.tripsByIds.values();
    }

    @Override
    public void executeTrip(Company c, Trip t) {
        if(!this.tripsByIds.containsKey(t.id) || !this.companiesByName.containsKey(c.name)){
            throw new IllegalArgumentException();
        }

        boolean removed = this.companiesWithTrip.get(c.name).removeIf(tr -> tr.id.equals(t.id));

        if(!removed){
            throw new IllegalArgumentException();
        }

        this.tripsByIds.remove(t.id);
    }

    @Override
    public Collection<Company> getCompaniesWithMoreThatNTrips(int n) {
//        return  getCompanies().stream().filter(c -> c.tripOrganizationLimit > n).collect(Collectors.toList());
        return this.companiesWithTrip.entrySet().stream().filter(e -> e.getValue().size() > n)
                .map(e -> this.companiesByName.get(e.getKey())).collect(Collectors.toList());
    }

    @Override
    public Collection<Trip> getTripsWithTransportationType(Transportation t) {
        return getTrips().stream().filter(e -> e.transportation.equals(t)).collect(Collectors.toList());
    }

    @Override
    public Collection<Trip> getAllTripsInPriceRange(int lo, int hi) {
        return getTrips().stream().filter(t -> t.price >= lo && t.price <= hi).collect(Collectors.toList());
    }
}
