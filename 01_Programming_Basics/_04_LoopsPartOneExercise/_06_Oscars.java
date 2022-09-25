package _01_Programming_Basics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _06_Oscars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String actorName = scan.nextLine();
        double academyPoints = Double.parseDouble(scan.nextLine());
        int numberOfJury = Integer.parseInt(scan.nextLine());

        double totalPoints = academyPoints;

        for (int i = 0; i < numberOfJury; i++) {
            String nameOfJuror = scan.nextLine();
            double points = Double.parseDouble(scan.nextLine());
            totalPoints += points * nameOfJuror.length() / 2;
            if(totalPoints >= 1250.5){
                break;
            }
        }

        if(totalPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - totalPoints);
        }
    }
}
