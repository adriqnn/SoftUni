package _03_JavaAdvanced._07_WorkshopExercise._03_LinkedListTail;

public class Node {
    public int value;
    public Node next;

    public Node(int value){
        this.value = value;
    }

    @Override
    public String toString(){
        return this.value + "";
    }
}
