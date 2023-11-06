package _04_JavaOOP._11_DesignPatterns._01_Singleton;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the singleton
        singleton.doSomething();
    }
}
