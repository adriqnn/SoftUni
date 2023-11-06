package _04_JavaOOP._11_DesignPatterns._03_Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
