package _03_JavaAdvanced._07_Workshop._02_CustomStack;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private Node top;
    private int size;

    public CustomStack(){
    }
    public void push(int element){
        Node newNode = new Node(element);
        if(this.top != null){
            newNode.prev = this.top;
        }
        top = newNode;
        this.size++;
    }
    public int peek(){
        ensureNotEmpty();
        return this.top.element;
    }
    private void ensureNotEmpty() {
        if (this.top == null) {
            throw new NoSuchElementException("Empty Element");
        }
    }
    public int pop(){
        ensureNotEmpty();
        int popped = this.top.element;
        this.top = this.top.prev;
        this.size--;
        return popped;
    }
    private static class Node{
        private int element;
        private Node prev;

        private Node(int element){
            this.element = element;
        }
    }
    public int size(){
        return this.size;
    }
    public void forEach(Consumer<Integer> consumer){
        Node current = this.top;
        while(current != null){
            consumer.accept(current.element);
            current = current.prev;
        }
    }
}
