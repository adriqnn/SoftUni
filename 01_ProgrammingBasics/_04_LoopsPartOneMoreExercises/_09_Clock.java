package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

public class _09_Clock {
    public static void main(String[] args) {
        // Print time
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                System.out.printf("%d : %d%n", i, j);
            }
        }
    }
}
