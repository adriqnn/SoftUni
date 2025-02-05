package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _11_Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int numberOfSnowballs = Integer.parseInt(scan.nextLine());

        // Add variables
        double max = Double.NEGATIVE_INFINITY;
        int maxSnowballSnow = 0;
        int maxSnowballTime = 0;
        int maxSnowballQuality = 0;
        double maxSnowballValue = 0;

        // Determine which one is the best snowball
        for (int i = 0; i < numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());
            double snowballValue = Math.pow((1.00 * snowballSnow / snowballTime), 1.00 * snowballQuality);
            
            if (snowballValue > max){
                maxSnowballSnow = snowballSnow;
                maxSnowballTime = snowballTime;
                maxSnowballQuality = snowballQuality;
                maxSnowballValue = snowballValue;
                max = snowballValue;
            }
        }
        
        // Print result
        System.out.printf("%d : %d = %.0f (%d)", maxSnowballSnow, maxSnowballTime, maxSnowballValue, maxSnowballQuality);
        
        scan.close();
    }
}
