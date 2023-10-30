package _04_JavaOOP._06_SOLID._05_DependencyInversion;

// Concrete implementation of a fan
public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan is off");
    }
}
