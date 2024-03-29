package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _06_SpeedInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the speed input
        double speed = Double.parseDouble(scan.nextLine());

        // Categorize the speed based on its value
        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed <= 50) {
            System.out.println("average");
        } else if (speed <= 150) {
            System.out.println("fast");
        } else if (speed <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }

        scan.close();
    }
}
