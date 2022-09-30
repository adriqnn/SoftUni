package _03_JavaAdvanced._08_GenericsExercise._11_Theeuple;

public class Threeuple<T, G, F> {
    private Item1<T> item1;
    private Item2<G> item2;
    private Item3<F> item3;

    public Threeuple(Item1<T> item1, Item2<G> item2, Item3<F> item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public Item1<T> getItem1() {
        return item1;
    }

    public Threeuple<T, G, F> setItem1(Item1<T> item1) {
        this.item1 = item1;
        return this;
    }

    public Item2<G> getItem2() {
        return item2;
    }

    public Threeuple<T, G, F> setItem2(Item2<G> item2) {
        this.item2 = item2;
        return this;
    }

    public Item3<F> getItem3() {
        return item3;
    }

    public Threeuple<T, G, F> setItem3(Item3<F> item3) {
        this.item3 = item3;
        return this;
    }

    @Override
    public String toString(){
        return getItem1() + " -> " + getItem2() + " -> " + getItem3();
    }
}
