package _04_JavaOOP._04_InterfacesAndAbstraction._01_02_CarShopAndExtended;

public class CarImpl implements Car{
    private final String model;
    private final String color;
    private final Integer horsePower;
    private final String countryProduced;

    public CarImpl(String model, String color, Integer horsePower, String countryProduced) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public Integer getHorsePower() {
        return null;
    }

    @Override
    public String countryProduced() {
        return null;
    }

    @Override
    public String toString(){
        return "This is " + this.model + " produced in " + this.countryProduced + " and have " + Car.TIRES + " tires";
    }
}
