package _01_ProgrammingBasics._04_LoopsPartOneExercise;

public class _01_NumberEndingIn7 {
    public static void main(String[] args) {

        // Iterate through numbers from 7 to 1000
        for (int i = 7; i <= 1000; i++) {
            // Check if the last digit is 7
            if (i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
