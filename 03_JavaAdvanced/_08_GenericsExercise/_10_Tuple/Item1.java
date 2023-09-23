package _03_JavaAdvanced._08_GenericsExercise._10_Tuple;

public class Item1<T> {
    T element;

    public Item1(T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public Item1<T> setElement(T element) {
        this.element = element;
        
        return this;
    }

    @Override
    public String toString(){
        return this.element.toString();
    }
}
