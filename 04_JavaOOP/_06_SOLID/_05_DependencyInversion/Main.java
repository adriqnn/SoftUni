package _04_JavaOOP._06_SOLID._05_DependencyInversion;

public class Main {
    public static void main(String[] args) {
        // Dependency Inversion example

        // Create switchable devices: a light bulb and a fan
        Switchable bulb = new LightBulb();
        Switchable fan = new Fan();

        // Create a switch
        Switch wallSwitch = new Switch();

        // Connect the light bulb to the switch
        wallSwitch.connect(bulb);

        // Use the switch to control the light bulb
        wallSwitch.turnOn();
        wallSwitch.turnOff();

        // Connect the fan to the switch
        wallSwitch.connect(fan);

        // Use the switch to control the fan
        wallSwitch.turnOn();
        wallSwitch.turnOff();
    }
}
