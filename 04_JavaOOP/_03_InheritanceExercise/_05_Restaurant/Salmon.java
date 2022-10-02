package _04_JavaOOP._03_InheritanceExercise._05_Restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish{
    private final static double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}
