package _01_ProgrammingBasics._06_NestedLoops;

public class _02_MultiplicationTable {
    public static void main(String[] args) {
        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i * j);
            }
        }
    }
}
