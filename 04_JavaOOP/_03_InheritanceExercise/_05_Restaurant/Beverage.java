package _04_JavaOOP._03_InheritanceExercise._05_Restaurant;

import java.math.BigDecimal;

public class Beverage extends Product{
    private double milliliters;

    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }

    public double getMilliliters() {
        return milliliters;
    }
}
