package _04_JavaOOP._06_SOLID._05_DependencyInversion._02_Worker;

public class Manager {
    public Manager() {
        Worker worker = new Worker();
        worker.work();
    }
}
