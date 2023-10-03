package _03_JavaAdvanced._09_IteratorsAndComparatorsExercise._03_StackIterator;


public class Node<Integer> {
    public int element;
    public Node<Integer> prev;

    public Node(int element) {
        this.element = element;
        this.prev = null;
    }
}
