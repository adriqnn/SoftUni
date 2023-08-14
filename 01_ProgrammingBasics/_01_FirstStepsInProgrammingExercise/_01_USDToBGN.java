package _01_ProgrammingBasics._01_FirstStepsInProgrammingExercise;

import java.util.Scanner;

public class _01_USDToBGN {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input USD amount
        double usd = Double.parseDouble(scan.nextLine());

        // Convert USD to BGN
        double bgn = usd * 1.79549;

        // Print the converted amount
        System.out.println(bgn);
        
        scan.close();
    }
}
