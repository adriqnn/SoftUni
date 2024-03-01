package implementations;

import interfaces.Decrease;
import interfaces.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinHeap<E extends Comparable<E> & Decrease<E>> implements Heap<E> {
    private List<E> elements;

    public MinHeap(){
        this.elements = new ArrayList<>();
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public void add(E element) {
        this.elements.add(element);
        this.heapifyUp(this.elements.size() -1);
    }

    private void heapifyUp(int index) {
        int parentIndex = this.getParentIndexFor(index);

        while(index > 0 && isLess(index, parentIndex)){
            Collections.swap(this.elements, index, parentIndex);
            index = parentIndex;
            parentIndex = this.getParentIndexFor(index);
        }
    }

    private int getParentIndexFor(int index) {
        return (index - 1) / 2;
    }

    private boolean isLess(int firstIndex, int secondIndex) {
        return this.elements.get(firstIndex).compareTo(this.elements.get(secondIndex)) < 0;
    }

    @Override
    public E peek() {
        ensureNonEmpty();
        return this.elements.get(0);
    }

    private void ensureNonEmpty() {
        if(this.elements.size() == 0){
            throw new IllegalStateException();
        }
    }

    @Override
    public E poll() {
        ensureNonEmpty();

        Collections.swap(this.elements, 0, this.elements.size() - 1);
        E toReturn = this.elements.remove(this.elements.size() - 1);

        this.heapifyDown();

        return toReturn;
    }

    private void heapifyDown() {
        int index = 0;
        int swapIndex =  getLeftChildIndex(index);

        while(swapIndex < this.elements.size()){
            int rightChildIndex = this.getRightChildIndex(index);
            if(rightChildIndex < this.elements.size()){
                swapIndex = isLess(swapIndex, rightChildIndex) ? swapIndex : rightChildIndex;
            }

            if(isLess(index, swapIndex)){
                break;
            }

            Collections.swap(this.elements, index, swapIndex);
            index = swapIndex;
            
            swapIndex = getLeftChildIndex(index);
        }
    }

    private int getLeftChildIndex(int index) {
        return (2 * index) + 1;
    }

    private int getRightChildIndex(int index) {
        return (2 * index) + 2;
    }

    @Override
    public void decrease(E element) {
        int elementIndex = this.elements.indexOf(element);

        E heapElement = this.elements.get(elementIndex);
        heapElement.decrease();

        this.heapifyUp(elementIndex);
    }
}
