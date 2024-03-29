package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._06_StrategyPattern;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
    
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
