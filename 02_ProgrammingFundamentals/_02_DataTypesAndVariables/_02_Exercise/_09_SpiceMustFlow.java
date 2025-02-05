package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _09_SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int startingYieldOfSource = Integer.parseInt(scan.nextLine());

        // Add variables
        int yield = 0;
        int days = 0;

        // Calculate the yield of the source
        while (startingYieldOfSource >= 100) {
            yield += startingYieldOfSource;
            startingYieldOfSource -= 10;
            
            days++;
            yield -= 26;
        }

        // Yield check for additional days
        if (yield >= 26){
            yield -= 26;
        }

        // Print result
        System.out.println(days);
        System.out.println(yield);

        scan.close();
    }
}
