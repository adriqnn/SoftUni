package _03_JavaAdvanced._08_GenericsExercise._02_GenericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values;

    public Box() {
        this.values = new ArrayList<>();
    }

    public void add(T element){
        values.add(element);
    }

    @Override
    public String toString(){
        StringBuilder sb  = new StringBuilder();

        for (T value : values) {
            sb.append(String.format("%s: %s", value.getClass().getName(), value)).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
