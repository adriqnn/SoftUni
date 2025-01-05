package _01_ProgrammingBasics._08_ExamPrep;

import java.util.Scanner;

public class _02_FinalCompetition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int dancers = Integer.parseInt(scan.nextLine());
        double points = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine();
        String place = scan.nextLine();

        // Add variable
        double prize = 0;

        // Determine the prize
        if (place.equals("Bulgaria")) {
            prize = points * dancers;
            
            if (season.equals("summer")) {
                prize *= 0.95;
            } else if (season.equals("winter")) {
                prize *= 0.92;
            }
        } else {
            prize = (points * dancers) + ((points * dancers) * 0.50);
            
            if (season.equals("summer")) {
                prize *= 0.90;
            } else if (season.equals("winter")) {
                prize *= 0.85;
            }
        }

        double charity = prize * 0.75;
        prize -= charity;

        // Print result
        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f%n", prize / dancers);

        scan.close();
    }
}
