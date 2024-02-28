package implementations;

import interfaces.AbstractQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PriorityQueue<E extends Comparable<E>> implements AbstractQueue<E> {
    private List<E> elements;

    public PriorityQueue(){
        this.elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public void add(E element) {
        this.elements.add(element);
        this.heapifyUp(this.size() - 1);
    }

    private void heapifyUp(int index) {
        while(index > 0 && isLess(index, getParentIndex(index))){
            int parentIndex = getParentIndex(index);
            Collections.swap(this.elements, index, parentIndex);
            index = parentIndex;
        }
    }

    private boolean isLess(int childIndex, int parentIndex) {
        return getAt(childIndex).compareTo(getAt(parentIndex)) > 0;
    }

    private E getAt(int index){
        return this.elements.get(index);
    }

    private int getParentIndex(int index) {
        return (index - 1) / 2;
    }

    private void ensureNonEmpty() {
        if(this.size() == 0){
            throw new IllegalStateException();
        }
    }

    @Override
    public E peek() {
        ensureNonEmpty();

        return getAt(0);
    }

    @Override
    public E poll() {
        ensureNonEmpty();

        E returnedValue = getAt(0);

        Collections.swap(this.elements, 0, this.size() - 1);
        this.elements.remove(this.size() - 1);
        this.heapifyDown(0);

        return returnedValue;
    }

    private void heapifyDown(int index) {
        while(getLeftChildIndex(index) < this.size() && isLessFirstAndSecond(index, getLeftChildIndex(index))){
            int rightChildIndex = getRightChildIndex(index);
            int leftChildIndex = getLeftChildIndex(index);

            if(rightChildIndex < this.size() && isLessFirstAndSecond(leftChildIndex, rightChildIndex)){
                leftChildIndex = rightChildIndex;
            }

            Collections.swap(this.elements, leftChildIndex, index);
            index = leftChildIndex;
        }
    }

    private void heapifyDownProper(int index){
        while(index < this.elements.size() / 2){
            int child = 2 * index + 1;

            if(child + 1 < this.elements.size() && isLessFirstAndSecond(child, child + 1)){
                child = child + 1;
            }

            if(isLessFirstAndSecond(child, index)){
                break;
            }

            Collections.swap(this.elements, index, child);
            index = child;
        }
    }

    private boolean isLessFirstAndSecond(int first, int second) {
        return getAt(first).compareTo(getAt(second)) < 0;
    }

    private E getLeftChild(int index){
        return this.elements.get(this.getLeftChildIndex(index));
    }

    private E getRightChild(int index){
        return this.elements.get(this.getRightChildIndex(index));
    }

    private int getLeftChildIndex(int index){
        return (index * 2) + 1;
    }

    private int getRightChildIndex(int index){
        return (index * 2) + 2;
    }
}
