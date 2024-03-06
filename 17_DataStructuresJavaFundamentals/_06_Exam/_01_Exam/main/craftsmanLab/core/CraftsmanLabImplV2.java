package craftsmanLab.core;

import craftsmanLab.models.ApartmentRenovation;
import craftsmanLab.models.Craftsman;

import java.util.*;
import java.util.stream.Collectors;

public class CraftsmanLabImplV2 implements CraftsmanLab {
    private Map<String, ApartmentRenovation> jobs;
    private Map<String, Craftsman> jobAndCraftsman;

    private Map<String, Craftsman> craftsmans;
    private Map<String, List<ApartmentRenovation>> craftsmanAndJobs;

    public CraftsmanLabImplV2() {
        this.craftsmans = new LinkedHashMap<>();
        this.jobs = new LinkedHashMap<>();
        this.craftsmanAndJobs = new LinkedHashMap<>();
        this.jobAndCraftsman = new LinkedHashMap<>();
    }

    @Override
    public void addApartment(ApartmentRenovation job) {
        if(this.jobs.containsKey(job.getAddress())){
            throw new IllegalArgumentException();
        }

        this.jobs.putIfAbsent(job.getAddress(), job);
        this.jobAndCraftsman.putIfAbsent(job.getAddress(), null);
    }

    @Override
    public void addCraftsman(Craftsman craftsman) {
        if(this.craftsmans.containsKey(craftsman.getName())){
            throw new IllegalArgumentException();
        }

        this.craftsmans.putIfAbsent(craftsman.getName(), craftsman);
        this.craftsmanAndJobs.putIfAbsent(craftsman.getName(), new ArrayList<>());
    }

    @Override
    public boolean exists(ApartmentRenovation job) {
        return this.jobs.containsKey(job.getAddress());
    }

    @Override
    public boolean exists(Craftsman craftsman) {
        return this.craftsmans.containsKey(craftsman.getName());
    }

    @Override
    public void removeCraftsman(Craftsman craftsman) {
        if(!this.craftsmans.containsKey(craftsman.getName())){
            throw new IllegalArgumentException();
        }

        if(this.craftsmanAndJobs.get(craftsman.getName()).size() != 0){
            throw new IllegalArgumentException();
        }

        this.craftsmans.remove(craftsman.getName());
        this.craftsmanAndJobs.remove(craftsman.getName());
    }

    @Override
    public Collection<Craftsman> getAllCraftsmen() {
        return this.craftsmans.values();
    }

    @Override
    public void assignRenovations() {
        for (Map.Entry<String, Craftsman> entry : this.jobAndCraftsman.entrySet()) {
            if(entry.getValue() == null){
                Craftsman craftsman = getLeastProfitable();
                double hourlyRate = craftsman.getHourlyRate();
                double workHoursNeeded = this.jobs.get(entry.getKey()).getWorkHoursNeeded();
                double income = hourlyRate * workHoursNeeded;
                double earnings = craftsman.getTotalEarnings();

                craftsman.setTotalEarnings(earnings + income);

                this.craftsmanAndJobs.get(craftsman.getName()).add(this.jobs.get(entry.getKey()));
                entry.setValue(craftsman);
                this.craftsmans.put(craftsman.getName(),craftsman);
            }
        }
    }

    @Override
    public Craftsman getContractor(ApartmentRenovation job) {
        if(this.jobAndCraftsman.get(job.getAddress()) == null){
            throw new IllegalArgumentException();
        }

        return this.jobAndCraftsman.get(job.getAddress());
    }

    @Override
    public Craftsman getLeastProfitable() {
        return this.craftsmans.values().stream().min(Comparator.comparing(Craftsman::getTotalEarnings)).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public Collection<ApartmentRenovation> getApartmentsByRenovationCost() {
        return jobAndCraftsman.entrySet().stream().sorted((a1, a2) -> {
            double a1N = a1.getValue() == null ? this.jobs.get(a1.getKey()).getWorkHoursNeeded() : this.jobs.get(a1.getKey()).getWorkHoursNeeded() * a1.getValue().getHourlyRate();
            double a2N = a2.getValue() == null ? this.jobs.get(a2.getKey()).getWorkHoursNeeded() : this.jobs.get(a2.getKey()).getWorkHoursNeeded() * a2.getValue().getHourlyRate();

            int compare = Double.compare(a2N, a1N);

            return compare;
        }).map(e -> this.jobs.get(e.getKey())).collect(Collectors.toList());
    }

    @Override
    public Collection<ApartmentRenovation> getMostUrgentRenovations(int limit) {
        return this.jobs.values().stream().sorted(Comparator.comparing(ApartmentRenovation::getDeadline)).limit(limit).collect(Collectors.toList());
    }
}
