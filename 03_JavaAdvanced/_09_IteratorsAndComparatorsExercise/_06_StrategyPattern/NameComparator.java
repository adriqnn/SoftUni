package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._06_StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {
    
    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare(o1.getName().length(), o2.getName().length());
        
        if(result == 0){
            result = Character.compare(o1.getName().toLowerCase().charAt(0), o2.getName().toLowerCase().charAt(0));
        }
        
        return  result;
    }
}
