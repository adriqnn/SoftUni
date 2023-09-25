package _03_JavaAdvanced._06_DefiningClasses._02_Constructors;

public class Car {
    private String brand;
    private String model;
    private int hp;

    public Car(String brand, String model, int hp) {
        this.brand = brand;
        this.model = model;
        this.hp = hp;
    }

    public Car(String brand) {
        this(brand, "unknown", -1);
    }

    @Override
    public String toString(){
        return String.format("The car is: %s %s - %d HP.", this.brand, this.model, this.hp);
    }
}
