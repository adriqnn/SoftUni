package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _04_Walking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String console = scan.nextLine();

        int stepsCounter = 0;

        // Use a while loop to track the steps walked
        while (!console.equals("Going home")) {
            int steps = Integer.parseInt(console);
            stepsCounter += steps;

            if (stepsCounter >= 10000) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(10000 - stepsCounter));
                break;
            }

            console = scan.nextLine();
        }

        // Print result at the end
        if (console.equals("Going home")) {
            int stepsAfter = Integer.parseInt(scan.nextLine());
            stepsCounter += stepsAfter;
            
            if (stepsCounter >= 10000) {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", Math.abs(10000 - stepsCounter));
            } else {
                System.out.printf("%d more steps to reach goal.", Math.abs(10000 - stepsCounter));
            }
        }

        scan.close();
    }
}
