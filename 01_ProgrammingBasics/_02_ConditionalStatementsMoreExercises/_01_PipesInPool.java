package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class _01_PipesInPool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double volumeOfThePool = Double.parseDouble(scan.nextLine());
        double pipeOneFlowRate = Double.parseDouble(scan.nextLine());
        double pipeTwoFlowRate = Double.parseDouble(scan.nextLine());
        double hoursWorkerIsOut = Double.parseDouble(scan.nextLine());

        // Calculate volumes filled by each pipe
        double volumeFilledByPipeOne = pipeOneFlowRate * hoursWorkerIsOut;
        double volumeFilledByPipeTwo = pipeTwoFlowRate * hoursWorkerIsOut;

        // Calculate the combined volume filled by both pipes
        double combinedBothPipes = volumeFilledByPipeOne + volumeFilledByPipeTwo;

        // Check if the pool overflows or not and print result
        if (combinedBothPipes > volumeOfThePool) {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hoursWorkerIsOut, combinedBothPipes - volumeOfThePool);
        } else {
            double percentToWhichThePoolIsFilled = (combinedBothPipes / volumeOfThePool) * 100;
            double percentFirstPipe = (volumeFilledByPipeOne / combinedBothPipes) * 100;
            double percentSecondPipe = (volumeFilledByPipeTwo / combinedBothPipes) * 100;
            
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", percentToWhichThePoolIsFilled, percentFirstPipe, percentSecondPipe);
        }

        scan.close();
    }
}
