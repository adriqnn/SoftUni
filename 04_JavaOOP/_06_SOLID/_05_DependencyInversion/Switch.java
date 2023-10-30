package _04_JavaOOP._06_SOLID._05_DependencyInversion;

// High-level class representing a switch
public class Switch {
    private Switchable device;

    public void connect(Switchable device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }

    public void turnOff() {
        device.turnOff();
    }
}
