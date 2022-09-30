package _03_JavaAdvanced._08_GenericsExercise._06_GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {
    private List<T> values;

    /*T value;
    public void add(T element){
        this.value;
    }*/

    public Box() {
        this.values = new ArrayList<>();
    }
    public void swap(int firstIndex,int secondIndex){
        //Collections.swap(values,firstIndex,secondIndex);
        T temporary = values.get(firstIndex);
        values.set(firstIndex,values.get(secondIndex));
        values.set(secondIndex,temporary);
    }
    public int countOfGreaterItems(T element){
        return (int) values.stream().filter(e -> e.compareTo(element) > 0).count();

    }

    public void add(T element){
        values.add(element);
    }

    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();
        for (T value : values) {
            sb.append(String.format("%s: %s",value.getClass().getName(),value)).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
