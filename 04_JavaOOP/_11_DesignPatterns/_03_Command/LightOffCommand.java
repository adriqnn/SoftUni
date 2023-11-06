package _04_JavaOOP._11_DesignPatterns._03_Command;

public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.turnOff();
    }
}
