package craftsmanLab.core;

import craftsmanLab.models.ApartmentRenovation;
import craftsmanLab.models.Craftsman;

import java.util.*;
import java.util.stream.Collectors;

public class CraftsmanLabImplV4 implements CraftsmanLab {
    Set<ApartmentRenovation> jobs;
    PriorityQueue<Craftsman> craftsmans;

    public CraftsmanLabImplV4() {
        this.jobs = new LinkedHashSet<>();
        this.craftsmans = new PriorityQueue<>(Comparator.comparing(Craftsman::getTotalEarnings));
    }

    @Override
    public void addApartment(ApartmentRenovation job) {
        if(this.jobs.contains(job)){
            throw new IllegalArgumentException();
        }

        this.jobs.add(job);
    }

    @Override
    public void addCraftsman(Craftsman craftsman) {
        if(this.craftsmans.contains(craftsman)){
            throw new IllegalArgumentException();
        }

        this.craftsmans.offer(craftsman);
    }

    @Override
    public boolean exists(ApartmentRenovation job) {
        return this.jobs.contains(job);
    }

    @Override
    public boolean exists(Craftsman craftsman) {
        return this.craftsmans.contains(craftsman);
    }

    @Override
    public void removeCraftsman(Craftsman craftsman) {
        if(!exists(craftsman)){
            throw new IllegalArgumentException();
        }else{
            Craftsman cr = null;
            for (Craftsman c : this.craftsmans) {
                if(c.getName().equals(craftsman.name)){
                    cr = c;
                    break;
                }
            }

            if(cr.getJobs().size() > 0){
                throw new IllegalArgumentException();
            }else{
                this.craftsmans.remove(cr);
            }
        }
    }

    @Override
    public Collection<Craftsman> getAllCraftsmen() {
        return this.craftsmans;
    }

    @Override
    public void assignRenovations() {
        for (ApartmentRenovation apartmentRenovation : this.jobs) {
            if(apartmentRenovation.getCraftsman() == null){
                Craftsman craftsman = this.craftsmans.poll();

                if(craftsman != null){
                    double hourlyRate = craftsman.getHourlyRate();
                    double workHoursNeeded = apartmentRenovation.getWorkHoursNeeded();
                    double income = hourlyRate * workHoursNeeded;
                    double earnings = craftsman.getTotalEarnings();

                    craftsman.setTotalEarnings(earnings + income);
                    apartmentRenovation.setCraftsman(craftsman);
                    this.craftsmans.add(craftsman);
                }
            }
        }
    }

    @Override
    public Craftsman getContractor(ApartmentRenovation job) {
        if(!this.jobs.contains(job)){
            throw new IllegalArgumentException();
        }

        Optional<ApartmentRenovation> first = this.jobs.stream().filter(e -> e.getAddress().equals(job.getAddress())).findFirst();

        if(first.isPresent()){
            return first.get().getCraftsman();
        }else{
            throw new IllegalArgumentException();
        }
    }

    @Override
    public Craftsman getLeastProfitable() {
        if(this.craftsmans.size() == 0){
            throw new IllegalArgumentException();
        }

        return this.craftsmans.peek();
    }

    @Override
    public Collection<ApartmentRenovation> getApartmentsByRenovationCost() {
        return this.jobs.stream().sorted((a1, a2) -> {
            double a1Cost = a1.getCraftsman() == null ? a1.getWorkHoursNeeded() : a1.getWorkHoursNeeded() * a1.getCraftsman().getHourlyRate();
            double a2Cost = a2.getCraftsman() == null ? a2.getWorkHoursNeeded() : a2.getWorkHoursNeeded() * a2.getCraftsman().getHourlyRate();

            return Double.compare(a2Cost, a1Cost);
        }).collect(Collectors.toList());
    }

    @Override
    public Collection<ApartmentRenovation> getMostUrgentRenovations(int limit) {
        return this.jobs.stream().sorted(Comparator.comparing(ApartmentRenovation::getDeadline)).limit(limit).collect(Collectors.toList());
    }
}
