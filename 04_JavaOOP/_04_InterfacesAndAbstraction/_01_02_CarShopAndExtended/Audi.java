package _04_JavaOOP._04_InterfacesAndAbstraction._01_02_CarShopAndExtended;

public class Audi extends CarImpl implements Rentable {
    private final Integer minRentDay;
    private final Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String countryProduced, Integer minRentDay, Double pricePerDay) {
        super(model, color, horsePower, countryProduced);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return super.toString() + System.lineSeparator() + "Minimal rental period of " + this.minRentDay + " days. Price per day " + this.pricePerDay;
    }
}
