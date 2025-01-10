package _01_ProgrammingBasics._06_NestedLoops;

public class _01_Clock {
    public static void main(String[] args) {
        // Print the time
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                System.out.printf("%d:%d%n", h, m);
            }
        }
    }
}
