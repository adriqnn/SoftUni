package _04_JavaOOP._11_DesignPatterns._01_Singleton;

public class Singleton {
    // Private static volatile instance variable to ensure visibility in a multithreaded environment
    private static volatile Singleton instance;

    // Private constructor to prevent external instantiation
    private Singleton() {
    }

    // Double-Checked Locking for thread safety
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // Example method
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}
