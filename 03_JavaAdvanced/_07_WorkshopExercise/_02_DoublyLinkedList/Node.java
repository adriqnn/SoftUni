package _03_JavaAdvanced._07_WorkshopExercise._02_DoublyLinkedList;

public class Node {
    public int value;
    public Node next;
    public Node prev;

    public Node(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value + "";
    }
}
