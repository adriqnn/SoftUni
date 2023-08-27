package _02_ProgrammingFundamentals._02_DataTypesAndVariables._01_Lecture;

import java.util.Scanner;

public class _09_CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int centuries = Integer.parseInt(scan.nextLine());
        
        // Add variables
        double years = centuries * 100;
        double days = years * 365.2422;
        double hours = days * 24;
        double minutes = hours * 60;

        // Print result
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes", centuries, years, days, hours, minutes);

        scan.close();
    }
}
