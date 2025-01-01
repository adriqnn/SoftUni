package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.Scanner;

public class _05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int gameTurns = Integer.parseInt(scan.nextLine());

        // Add variables
        double gameResult = 0;
        double invalidNumbers = 0;
        double numbersFrom0to9 = 0;
        double numbersFrom10to19 = 0;
        double numbersFrom20to29 = 0;
        double numbersFrom30to39 = 0;
        double numbersFrom40to50 = 0;

        // Process each game turn and calculate statistics
        for (int i = 0; i < gameTurns; i++) {
            int gameNumber = Integer.parseInt(scan.nextLine());

            if (gameNumber < 0 || gameNumber > 50) {
                invalidNumbers++;
                if (gameResult > 0) {
                    gameResult = gameResult/2;
                }
            } else if (gameNumber <= 9) {
                numbersFrom0to9++;
                gameResult += gameNumber * 0.2;
            } else if (gameNumber <= 19) {
                numbersFrom10to19++;
                gameResult += gameNumber * 0.3;
            } else if (gameNumber <= 29) {
                numbersFrom20to29++;
                gameResult += gameNumber * 0.4;
            } else if (gameNumber <= 39) {
                numbersFrom30to39++;
                gameResult += 50;
            } else {
                numbersFrom40to50++;
                gameResult += 100;
            }
        }

        // Calculate and print the statistics
        System.out.printf("%.2f%n", gameResult);
        System.out.printf("From 0 to 9: %.2f%%%n", numbersFrom0to9 / gameTurns * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", numbersFrom10to19 / gameTurns * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", numbersFrom20to29 / gameTurns * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", numbersFrom30to39 / gameTurns * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", numbersFrom40to50 / gameTurns * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalidNumbers / gameTurns * 100);

        scan.close();
    }
}
