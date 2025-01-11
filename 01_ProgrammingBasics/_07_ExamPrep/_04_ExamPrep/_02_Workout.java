package _01_ProgrammingBasics._08_ExamPrep;

import java.util.Scanner;

public class _02_Workout {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int nDays = Integer.parseInt(scan.nextLine());
        double nKilometers = Double.parseDouble(scan.nextLine());

        // Add variables
        double distance = nKilometers;
        double allDistance = nKilometers;

        // Determine the running distance
        for (int i = 1; i <= nDays; i++) {
            double percentile = Double.parseDouble(scan.nextLine());
            
            distance = distance + (distance * percentile / 100);
            allDistance += distance;
        }

        // Print result
        if (allDistance >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(allDistance - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - allDistance));
        }

        scan.close();
    }
}
