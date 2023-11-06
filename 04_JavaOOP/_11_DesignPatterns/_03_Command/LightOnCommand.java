package _04_JavaOOP._11_DesignPatterns._03_Command;

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.turnOn();
    }
}
