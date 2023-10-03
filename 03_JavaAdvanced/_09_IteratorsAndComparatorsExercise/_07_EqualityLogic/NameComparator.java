package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._07_EqualityLogic;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare(o1.hashCode(), o2.hashCode());
        
        return  result;
    }
}
