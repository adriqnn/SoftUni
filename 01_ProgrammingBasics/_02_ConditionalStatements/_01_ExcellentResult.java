package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int grade = Integer.parseInt(scan.nextLine());
        boolean isExcellent = grade >= 5;

        if (grade >=5){
            System.out.println("Excellent!");
        }
    }
}
