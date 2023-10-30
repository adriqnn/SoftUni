package _04_JavaOOP._06_SOLID._04_InterfaceSegregation;

// A class representing a supervisor worker who can work and eat
public class SupervisorWorker implements Worker, Eater {
    public void work() {
        // Supervisor worker-specific work
        System.out.println("Supervisor Worker is working.");
    }

    public void eat() {
        // Supervisor worker-specific eating
        System.out.println("Supervisor Worker is eating.");
    }
}
