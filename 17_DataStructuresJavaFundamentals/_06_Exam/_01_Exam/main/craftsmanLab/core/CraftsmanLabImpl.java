package craftsmanLab.core;

import craftsmanLab.models.ApartmentRenovation;
import craftsmanLab.models.Craftsman;

import java.util.*;
import java.util.stream.Collectors;

public class CraftsmanLabImpl implements CraftsmanLab {
    private final Map<String, ApartmentRenovation> apartments;
    private final Map<String, Craftsman> craftsmen;
    private final PriorityQueue<Craftsman> craftsmenByProfit;
    private final Map<String, Craftsman> apartmentRenovator;

    public CraftsmanLabImpl() {
        this.apartments = new LinkedHashMap<>();
        this.craftsmen = new HashMap<>();
        this.craftsmenByProfit = new PriorityQueue<>(Comparator.comparingDouble(c -> c.totalEarnings));
        this.apartmentRenovator = new HashMap<>();
    }

    @Override
    public void addApartment(ApartmentRenovation job) {
        if (exists(job)) {
            throw new IllegalArgumentException();
        }

        this.apartments.put(job.address, job);
    }

    @Override
    public void addCraftsman(Craftsman craftsman) {
        if (exists(craftsman)) {
            throw new IllegalArgumentException();
        }

        this.craftsmen.put(craftsman.name, craftsman);
        this.craftsmenByProfit.add(craftsman);
    }

    @Override
    public boolean exists(ApartmentRenovation job) {
        return this.apartments.containsKey(job.address);
    }

    @Override
    public boolean exists(Craftsman craftsman) {
        return this.craftsmen.containsKey(craftsman.name);
    }

    @Override
    public void removeCraftsman(Craftsman craftsman) {
        if (!exists(craftsman)) {
            throw new IllegalArgumentException();
        }

        if (this.apartmentRenovator.containsValue(craftsman)) {
            throw new IllegalArgumentException();
        }

        this.craftsmenByProfit.remove(craftsman);
        this.craftsmen.remove(craftsman.name);
    }

    @Override
    public Collection<Craftsman> getAllCraftsmen() {
        return this.craftsmen.values();
    }

    @Override
    public void assignRenovations() {
        for (ApartmentRenovation job : apartments.values()) {
            if (this.apartmentRenovator.containsKey(job.address)) {
                continue;
            }

            Craftsman doingRepair = this.craftsmenByProfit.poll();

            doingRepair.totalEarnings += job.workHoursNeeded *  doingRepair.hourlyRate;

            this.craftsmenByProfit.offer(doingRepair);
            this.apartmentRenovator.put(job.address, doingRepair);
        }
    }

    @Override
    public Craftsman getContractor(ApartmentRenovation job) {
        if (!this.apartmentRenovator.containsKey(job.address)) {
            throw new IllegalArgumentException();
        }

        return this.apartmentRenovator.get(job.address);
    }


    @Override
    public Craftsman getLeastProfitable() {
        if (this.craftsmenByProfit.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return this.craftsmenByProfit.peek();
    }

    @Override
    public Collection<ApartmentRenovation> getApartmentsByRenovationCost() {
        return this.apartments.values().stream()
                .sorted((l, r) -> {
                    Craftsman leftCraftsman = this.apartmentRenovator.get(l.address);
                    Craftsman rightCraftsman = this.apartmentRenovator.get(r.address);

                    double leftCost = leftCraftsman == null ?
                            l.workHoursNeeded : leftCraftsman.hourlyRate * l.workHoursNeeded;
                    double rightCost = rightCraftsman == null ?
                            r.workHoursNeeded : rightCraftsman.hourlyRate * r.workHoursNeeded;

                    return Double.compare(rightCost, leftCost);
                })
                .collect(Collectors.toList());
    }

    @Override
    public Collection<ApartmentRenovation> getMostUrgentRenovations(int limit) {
        return this.apartments.values()
                .stream()
                .sorted(Comparator.comparing(c -> c.deadline))
                .limit(limit)
                .collect(Collectors.toList());
    }
}
