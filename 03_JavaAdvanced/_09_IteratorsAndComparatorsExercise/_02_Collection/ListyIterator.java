package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._02_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator implements Iterable<String>{
    private List<String> elements;
    private int currentIndex;

    public ListyIterator(String... elements){
        this.elements = Arrays.asList(elements);
        this.currentIndex = 0;
    }
    
    public boolean hasNext(){
        return this.currentIndex < this.elements.size() - 1;
    }
    
    public boolean move(){
        if(hasNext()){
            this.currentIndex++;
            return true;
        }
        
        return false;
    }
    
    public void print(){
        if(this.elements.size() == 0){
            throw new IllegalStateException("Invalid Operation!");
        }
        
        System.out.println(this.elements.get(this.currentIndex));
    }
    
    public void printAll(){
        this.forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index;
            
            @Override
            public boolean hasNext() {
                return index < elements.size();
            }

            @Override
            public String next() {
                return elements.get(index++);
            }
        };
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        this.elements.forEach(action::accept);
    }
}
