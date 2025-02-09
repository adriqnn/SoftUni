package _02_ProgrammingFundamentals._05_Lists._03_MoreExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_CarRace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // Add variables
        double timeFirstRacer = 0;
        double timeSecondRacer = 0;

        // Determine the time of the first racer
        for (int i = 0; i < numbersList.size() / 2; i++) {
            if (numbersList.get(i) == 0) {
                timeFirstRacer *= 0.8;
                continue;
            }

            timeFirstRacer += numbersList.get(i);
        }

        // Determine the time of the second racer
        for (int i = numbersList.size() - 1; i > numbersList.size() / 2; i--) {
            if (numbersList.get(i) == 0) {
                timeSecondRacer *= 0.8;
                continue;
            }

            timeSecondRacer += numbersList.get(i);
        }

        // Print result
        if (timeFirstRacer < timeSecondRacer) {
            System.out.printf("The winner is left with total time: %.1f%n", timeFirstRacer);
        } else if (timeFirstRacer > timeSecondRacer) {
            System.out.printf("The winner is right with total time: %.1f%n", timeSecondRacer);
        }

        scan.close();
    }
}
