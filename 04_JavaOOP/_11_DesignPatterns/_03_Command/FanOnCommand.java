package _04_JavaOOP._11_DesignPatterns._03_Command;

public class FanOnCommand implements Command {
    private Fan fan;

    public FanOnCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        this.fan.turnOn();
    }
}
