package _03_JavaAdvanced._08_GenericsExercise._01_GenericBox;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private List<T> values;

    /*T value;
    public void add(T element){
        this.value;
    }*/

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
