package _04_JavaOOP._11_DesignPatterns._03_Command;

public class FanOffCommand implements Command {
    private Fan fan;

    public FanOffCommand(Fan fan) {
        this.fan = fan;
    }

    public void execute() {
        this.fan.turnOff();
    }
}
