package _04_JavaOOP._03_InheritanceExercise._05_Restaurant;

import java.math.BigDecimal;

public class ColdBeverage extends Beverage{
    
    public ColdBeverage(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
