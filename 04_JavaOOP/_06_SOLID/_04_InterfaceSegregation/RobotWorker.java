package _04_JavaOOP._06_SOLID._04_InterfaceSegregation;

// A class representing a robot worker who can work but not eat
public class RobotWorker implements Worker {
    public void work() {
        // Robot worker-specific work
        System.out.println("Robot Worker is working.");
    }
}
