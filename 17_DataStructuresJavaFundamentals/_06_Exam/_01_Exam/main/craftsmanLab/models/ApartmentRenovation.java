package craftsmanLab.models;

import java.time.LocalDate;
import java.util.Objects;

public class ApartmentRenovation {
    public String address;
    public double area;
    public double workHoursNeeded;
    public LocalDate deadline;
    public Craftsman craftsman;

    public ApartmentRenovation(String address, double area, double workHoursNeeded, LocalDate deadline) {
        this.address = address;
        this.area = area;
        this.workHoursNeeded = workHoursNeeded;
        this.deadline = deadline;
        this.craftsman = null;
    }

    public Craftsman getCraftsman() {
        return craftsman;
    }

    public ApartmentRenovation setCraftsman(Craftsman craftsman) {
        this.craftsman = craftsman;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public ApartmentRenovation setAddress(String address) {
        this.address = address;
        return this;
    }

    public double getArea() {
        return area;
    }

    public ApartmentRenovation setArea(double area) {
        this.area = area;
        return this;
    }

    public double getWorkHoursNeeded() {
        return workHoursNeeded;
    }

    public ApartmentRenovation setWorkHoursNeeded(double workHoursNeeded) {
        this.workHoursNeeded = workHoursNeeded;
        return this;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public ApartmentRenovation setDeadline(LocalDate deadline) {
        this.deadline = deadline;
        return this;
    }

    @Override
    public String toString() {
        return "ApartmentRenovation{" +
                "address='" + address + '\'' +
                ", area=" + area +
                ", workHoursNeeded=" + workHoursNeeded +
                ", deadline=" + deadline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApartmentRenovation that = (ApartmentRenovation) o;

        return Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address);
    }
}
