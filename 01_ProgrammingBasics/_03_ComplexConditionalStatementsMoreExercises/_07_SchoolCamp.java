package _01_ProgrammingBasics._03_ComplexConditionalStatementsMoreExercises;

import java.util.Scanner;

public class _07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String season = scan.nextLine().toLowerCase();
        String groupType = scan.nextLine().toLowerCase();
        int studentsCount = Integer.parseInt(scan.nextLine());
        int nightsCount = Integer.parseInt(scan.nextLine());

        // Add variables
        double price = 0;
        String sport = "";

        // Calculate initial price for all the students
        if (season.equals("winter")) {
            price = groupType.equals("mixed") ? studentsCount * 10 * nightsCount : studentsCount * 9.60 * nightsCount;
            
            if (groupType.equals("girls")) {
                sport = "Gymnastics";
            } else if (groupType.equals("boys")) {
                sport = "Judo";
            } else {
                sport = "Ski";
            }
        } else if (season.equals("spring")) {
            price = groupType.equals("mixed") ? studentsCount * 9.50 * nightsCount : studentsCount * 7.20 * nightsCount;
            
            if (groupType.equals("girls")) {
                sport = "Athletics";
            } else if (groupType.equals("boys")) {
                sport = "Tennis";
            } else {
                sport = "Cycling";
            }
        } else {
            price = groupType.equals("mixed") ? studentsCount * 20 * nightsCount : studentsCount * 15 * nightsCount;
            
            if (groupType.equals("girls")) {
                sport = "Volleyball";
            } else if (groupType.equals("boys")) {
                sport = "Football";
            } else {
                sport = "Swimming";
            }
        }

        // Add in the discount
        if (studentsCount >= 10 && studentsCount < 20) {
            price *= 0.95;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            price *= 0.85;
        } else if (studentsCount >= 50) {
            price *= 0.50;
        }

        // Print the result
        System.out.printf("%s %.2f lv.", sport, price);

        scan.close();
    }
}
