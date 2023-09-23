package _03_JavaAdvanced._08_GenericsExercise._07_08_09_CustomListWithSorterAndIterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CustomList<T extends Comparable<T>> implements Iterable<T> {
    private List<T> elements;

    public CustomList(){
        elements = new ArrayList<>();
    }

    public void add(T element){
        elements.add(element);
    }

    public T remove(int index){
        return elements.remove(index);
    }

    public boolean contains(T element){
        return elements.contains(element);
    }

    public void swap(int firstIndex, int secondIndex){
        Collections.swap(elements, firstIndex, secondIndex);
    }

    public int countGreaterThan(T element){
        return (int) elements.stream().filter(value -> value.compareTo(element) > 0).count();
    }

    public T getMax(){
        return Collections.max(elements);
        //return elements.stream().max((first, second) -> first.compareTo(second)).get();
        //return elements.stream().max(Comparator.naturalOrder()).get();
    }

    public T getMin(){
        return Collections.min(elements);
        //return elements.stream().min((first, second) -> second.compareTo(first)).get();
        //return elements.stream().min(Comparator.naturalOrder()).get();
    }

    public int size(){
        return elements.size();
    }

    public T get (int index){
        return elements.get(index);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        
        for (T element : this.elements) {
            builder.append(element).append(System.lineSeparator());
        }
        
        return builder.toString();
    }

    @Override
    public Iterator<T> iterator(){
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;
            
            @Override
            public boolean hasNext(){
                return currentIndex < elements.size() && elements.get(currentIndex) != null;
            }
            
            @Override
            public T next(){
                return elements.get(currentIndex++);
            }
            
            @Override
            public void remove(){
                throw new UnsupportedOperationException();
            }
        };
        
        return it;
    }
}

