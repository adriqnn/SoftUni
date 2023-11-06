package _04_JavaOOP._11_DesignPatterns._02_Facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        System.out.println("Starting the computer.");

        this.cpu.processData();
        this.memory.load();
        this.hardDrive.readData();

        System.out.println("Computer started successfully.");
    }
}
