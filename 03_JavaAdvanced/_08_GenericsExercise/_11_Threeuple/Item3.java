package _03_JavaAdvanced._08_GenericsExercise._11_Threeuple;

public class Item3<F> {
    F element;

    public Item3(F element) {
        this.element = element;
    }

    public F getElement() {
        return this.element;
    }

    public Item3<F> setElement(F element) {
        this.element = element;

        return this;
    }

    @Override
    public String toString(){
        return this.element.toString();
    }
}
