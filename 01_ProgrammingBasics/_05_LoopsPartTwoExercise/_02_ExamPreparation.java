package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int poorGradeThreshold = Integer.parseInt(scan.nextLine());
        String problemName = scan.nextLine();

        // Add variables
        boolean needBreak = false;
        int poorGradeCount = 0;
        double totalScore = 0;
        int problemCount = 0;
        String lastProblem = "";

        // Use a while loop to input and process the grades and problem names
        while (!problemName.equals("Enough")) {
            int grade = Integer.parseInt(scan.nextLine());

            if (grade <= 4) {
                poorGradeCount++;

                if (poorGradeCount == poorGradeThreshold) {
                    needBreak = true;
                    break;
                }
            }

            lastProblem = problemName;
            totalScore += grade;
            problemCount++;

            problemName = scan.nextLine();
        }

        // Print result
        if (needBreak) {
            System.out.printf("You need a break, %d poor grades.%n", poorGradeCount);
        } else {
            // Calculate and display the average score, problem count, and last problem
            double averageScore = totalScore / problemCount;
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", problemCount);
            System.out.printf("Last problem: %s%n", lastProblem);
        }

        scan.close();
    }
}
