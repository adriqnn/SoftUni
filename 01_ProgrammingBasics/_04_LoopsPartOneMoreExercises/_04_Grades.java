package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.Scanner;

public class _04_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int examStudentsCount = Integer.parseInt(scan.nextLine());

        // Add variables
        double allTheGrades = 0;
        double topStudents = 0;
        double studentsWith4 = 0;
        double studentsWith3 = 0;
        double failedStudents = 0;

        // Process each student's grade and calculate statistics
        for (int i = 0; i < examStudentsCount; i++) {
            double grade = Double.parseDouble(scan.nextLine());

            if (grade >= 5.00) {
                topStudents++;
            } else if (grade >= 4.00) {
                studentsWith4++;
            } else if (grade >= 3.00) {
                studentsWith3++;
            } else {
                failedStudents++;
            }

            allTheGrades += grade;
        }

        // Calculate and print the statistics
        System.out.printf("Top students: %.2f%%%n", topStudents / examStudentsCount * 100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", studentsWith4 / examStudentsCount * 100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", studentsWith3 / examStudentsCount * 100);
        System.out.printf("Fail: %.2f%%%n", failedStudents / examStudentsCount * 100);
        System.out.printf("Average: %.2f%n", allTheGrades / examStudentsCount);

        scan.close();
    }
}
