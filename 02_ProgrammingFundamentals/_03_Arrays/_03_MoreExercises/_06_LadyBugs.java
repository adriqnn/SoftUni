package _02_ProgrammingFundamentals._03_Arrays._03_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _06_LadyBugs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int fieldSize = Integer.parseInt(scan.nextLine());
        int[] initialPositions = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Initialize positions
        int[] positionsInTheField = new int[fieldSize];
        for (int e : initialPositions) {
            if (e >= 0 && e < fieldSize) {
                positionsInTheField[e] = 1;
            }
        }

        String commands = scan.nextLine();

        // Change positions of the ladybugs based on commands
        while (!commands.equals("end")) {
            String[] commandLine = commands.split("\\s+");

            int bugIndex = Integer.parseInt(commandLine[0]);
            String bugMoveDirection = commandLine[1];
            int bugMoves = Integer.parseInt(commandLine[2]);

            if (bugMoveDirection.equals("left") && (bugIndex >= 0 && bugIndex < fieldSize) && (positionsInTheField[bugIndex] == 1)) {
                positionsInTheField[bugIndex] = 0;

                if (bugIndex - bugMoves >= 0) {
                    for (int i = bugIndex - bugMoves; i >= 0; i -= bugMoves) {
                        if (positionsInTheField[i] == 0) {
                            positionsInTheField[i] = 1;
                            break;
                        }
                    }
                }

            }else if (bugMoveDirection.equals("right") && (bugIndex >= 0 && bugIndex < fieldSize) && (positionsInTheField[bugIndex] == 1)) {
                positionsInTheField[bugIndex] = 0;

                if (bugIndex + bugMoves < fieldSize) {
                    for (int i = bugIndex+bugMoves; i < fieldSize; i+=bugMoves) {
                        if (positionsInTheField[i] == 0) {
                            positionsInTheField[i] = 1;
                            break;
                        }
                    }
                }

            }

            commands = scan.nextLine();
        }

        // Print result
        Arrays.stream(positionsInTheField).forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
