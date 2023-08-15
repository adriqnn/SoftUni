package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the grade input
        int grade = Integer.parseInt(scan.nextLine());

        // Determine if the grade is excellent
        boolean isExcellent = grade >= 5;

        // Print "Excellent!" if the grade is excellent
        if (isExcellent) {
            System.out.println("Excellent!");
        }

        scan.close();
    }
}
