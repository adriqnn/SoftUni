package _03_JavaAdvanced._08_GenericsExercise._10_Tuple;

public class Tuple<T, G> {
    private Item1<T> item1;
    private Item2<G> item2;

//    public Tuple(Item1<T> item1, Item2<T> item2) {
//        this.item1 = item1;
//        this.item2 = item2;
//    }

    public Tuple(Item1<T> item1, Item2<G> item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public Item1<T> getItem1() {
        return item1;
    }

    public Tuple<T, G> setItem1(Item1<T> item1) {
        this.item1 = item1;
        return this;
    }

    public Item2<G> getItem2() {
        return item2;
    }

    public Tuple<T, G> setItem2(Item2<G> item2) {
        this.item2 = item2;
        return this;
    }

    @Override
    public String toString(){
        return getItem1() + " -> " + getItem2();
    }
}
