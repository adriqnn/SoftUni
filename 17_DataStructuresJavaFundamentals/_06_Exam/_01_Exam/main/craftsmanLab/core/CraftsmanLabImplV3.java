package craftsmanLab.core;

import craftsmanLab.models.ApartmentRenovation;
import craftsmanLab.models.Craftsman;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CraftsmanLabImplV3 implements CraftsmanLab {
    List<ApartmentRenovation> jobs;
    List<Craftsman> craftsmen;

    public CraftsmanLabImplV3() {
        this.jobs = new ArrayList<>();
        this.craftsmen = new ArrayList<>();
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
        if(this.craftsmen.contains(craftsman)){
            throw new IllegalArgumentException();
        }

        this.craftsmen.add(craftsman);
    }

    @Override
    public boolean exists(ApartmentRenovation job) {
        return this.jobs.contains(job);
    }

    @Override
    public boolean exists(Craftsman craftsman) {
        return this.craftsmen.contains(craftsman);
    }

    @Override
    public void removeCraftsman(Craftsman craftsman) {
        if(!this.craftsmen.contains(craftsman)){
            throw new IllegalArgumentException();
        }

        int index = this.craftsmen.indexOf(craftsman);
        Craftsman found = this.craftsmen.get(index);
        if(found.getJobs().size() != 0){
            throw new IllegalArgumentException();
        }

        this.craftsmen.remove(found);
    }

    @Override
    public Collection<Craftsman> getAllCraftsmen() {
        return this.craftsmen;
    }

    @Override
    public void assignRenovations() {
        for (ApartmentRenovation apartmentRenovation : this.jobs) {
            if(apartmentRenovation.getCraftsman() == null){
                Craftsman craftsman = getLeastProfitable();

                double hourlyRate = craftsman.getHourlyRate();
                double workHoursNeeded = apartmentRenovation.getWorkHoursNeeded();
                double income = hourlyRate * workHoursNeeded;
                double earnings = craftsman.getTotalEarnings();

                craftsman.setTotalEarnings(earnings + income);
                craftsman.getJobs().add(apartmentRenovation);

                apartmentRenovation.setCraftsman(craftsman);
            }
        }
    }

    @Override
    public Craftsman getContractor(ApartmentRenovation job) {
        int index = this.jobs.indexOf(job);
        Craftsman craftsman = this.jobs.get(index).getCraftsman();

        if(craftsman == null){
            throw new IllegalArgumentException();
        }

        return craftsman;
    }

    @Override
    public Craftsman getLeastProfitable() {
        if(this.craftsmen.size() == 0){
            throw new IllegalArgumentException();
        }

        return this.craftsmen.stream().sorted(Comparator.comparingDouble(Craftsman::getTotalEarnings)).collect(Collectors.toList()).get(0);
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
