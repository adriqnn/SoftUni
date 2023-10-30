package _04_JavaOOP._06_SOLID._04_InterfaceSegregation;

// A class representing a regular worker
public class RegularWorker implements Worker {
    public void work() {
        // Regular worker-specific work
        System.out.println("Regular Worker is working.");
    }
}
