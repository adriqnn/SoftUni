package _01_ProgrammingBasics._05_LoopsPartTwo;

import java.util.Scanner;

public class _08_Graduation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String name = scan.nextLine();

        // Add variables
        int excluded = 0;
        int count = 1;
        double sum = 0;

        // Use a while loop to input and process the student's grades
        while (count <= 12) {
            double grade = Double.parseDouble(scan.nextLine());

            if (grade < 4.0) {
                excluded++;
            } else {
                count++;
            }

            // Check if the student has been excluded
            if (excluded > 1) {
                break;
            }

            sum += grade;
        }

        // Display the result based on the student's status
        if (excluded > 1) {
            System.out.printf("%s has been excluded at %d grade%n", name, count);
        } else {
            double averageGrade = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f%n", name, averageGrade);
        }

        scan.close();
    }
}
