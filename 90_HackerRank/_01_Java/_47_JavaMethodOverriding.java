package _05_HackerRank._01_Java;

public class _47_JavaMethodOverriding {
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.print();
    }
}

class Motor extends Vehicle{
    @Override
    public void print() {
        System.out.println("Hello I am a motorcycle, I am a cycle with an engine.");
        System.out.println("My ancestor is a cycle who is a vehicle with pedals.");
    }
}

class Vehicle{
    public void print(){
        System.out.println("vehicle");
    }
}