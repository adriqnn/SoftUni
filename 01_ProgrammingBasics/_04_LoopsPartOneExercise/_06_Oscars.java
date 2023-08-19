package _01_ProgrammingBasics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _06_Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String actorName = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int numberOfJury = Integer.parseInt(scan.nextLine());

        double totalPoints = academyPoints;

        for (int i = 0; i < numberOfJury; i++) {
            String nameOfJuror = scan.nextLine();
            double points = Double.parseDouble(scan.nextLine());

            // Calculate additional points based on the juror's name length
            totalPoints += points * nameOfJuror.length() / 2;

            // Check if the actor has enough points to get a nominee
            if (totalPoints >= 1250.5) {
                break;
            }
        }

        // Print the result based on the total points
        if (totalPoints >= 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n", actorName, totalPoints);
        } else {
            System.out.printf("Sorry, %s you need %.1f more!%n", actorName, 1250.5 - totalPoints);
        }

        scan.close();
    }
}
