package craftsmanLab.models;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Craftsman {
    public String name;
    public double hourlyRate;
    public double totalEarnings;
    public List<ApartmentRenovation> jobs;

    public Craftsman(String name, double hourlyRate, double totalEarnings) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.totalEarnings = totalEarnings;
        this.jobs = new ArrayList<>();
    }

    public List<ApartmentRenovation> getJobs() {
        return jobs;
    }

    public Craftsman setJobs(List<ApartmentRenovation> jobs) {
        this.jobs = jobs;
        return this;
    }

    public String getName() {
        return name;
    }

    public Craftsman setName(String name) {
        this.name = name;
        return this;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public Craftsman setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
        return this;
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }

    public Craftsman setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
        return this;
    }

    @Override
    public String toString() {
        return "Craftsman{" +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalEarnings=" + totalEarnings +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        
        if (o == null || getClass() != o.getClass()) return false;
        Craftsman craftsman = (Craftsman) o;
        
        return Double.compare(craftsman.hourlyRate, hourlyRate) == 0 && Double.compare(craftsman.totalEarnings, totalEarnings) == 0 && Objects.equals(name, craftsman.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hourlyRate, totalEarnings);
    }
}
