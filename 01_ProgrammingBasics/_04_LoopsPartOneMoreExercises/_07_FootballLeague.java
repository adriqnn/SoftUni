package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.Scanner;

public class _07_FootballLeague {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int stadiumCapacity = Integer.parseInt(scan.nextLine());
        double fansCount = Double.parseDouble(scan.nextLine());

        // Add variables
        double sectorA = 0;
        double sectorB = 0;
        double sectorV = 0;
        double sectorG = 0;

        // Process each fan's sector and calculate statistics
        for (int i = 0; i < fansCount; i++) {
            String sector = scan.nextLine().toLowerCase();

            if (sector.equals("a")) {
                sectorA++;
            } else if (sector.equals("b")) {
                sectorB++;
            } else if (sector.equals("v")) {
                sectorV++;
            } else if (sector.equals("g")) {
                sectorG++;
            }
        }

        // Calculate and print the statistics
        System.out.printf("%.2f%%%n", sectorA / fansCount * 100);
        System.out.printf("%.2f%%%n", sectorB / fansCount * 100);
        System.out.printf("%.2f%%%n", sectorV / fansCount * 100);
        System.out.printf("%.2f%%%n", sectorG / fansCount * 100);
        System.out.printf("%.2f%%%n", fansCount / stadiumCapacity * 100);

        scan.close();
    }
}
