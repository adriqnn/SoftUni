package _03_JavaAdvanced._08_GenericsExercise._10_Tuple;

public class Item2<G> {
    G element;

    public Item2(G element) {
        this.element = element;
    }

    public G getElement() {
        return element;
    }

    public Item2<G> setElement(G element) {
        this.element = element;
        return this;
    }

    @Override
    public String toString(){
        return this.element.toString();
    }
}