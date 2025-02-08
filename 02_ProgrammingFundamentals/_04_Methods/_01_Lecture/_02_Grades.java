package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _02_Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        double grade = Double.parseDouble(scan.nextLine());

        // Create method to qualify grades
        whatIsTheGrade(grade);

        scan.close();
    }

    private static void whatIsTheGrade(double grade) {
        if (grade >= 2.00 && grade < 3.00) {
            System.out.println("Fail");
        } else if (grade < 3.50) {
            System.out.println("Poor");
        } else if (grade < 4.50) {
            System.out.println("Good");
        } else if (grade < 5.50) {
            System.out.println("Very good");
        } else if (grade < 6.00) {
            System.out.println("Excellent");
        }
    }
}
