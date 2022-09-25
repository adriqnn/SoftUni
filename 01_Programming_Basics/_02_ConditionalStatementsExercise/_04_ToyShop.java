package _01_Programming_Basics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _04_ToyShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double travel = Double.parseDouble(scan.nextLine());
        double puzzles = Double.parseDouble(scan.nextLine());
        double dolls = Double.parseDouble(scan.nextLine());
        double bears = Double.parseDouble(scan.nextLine());
        double minions = Double.parseDouble(scan.nextLine());
        double trucks = Double.parseDouble(scan.nextLine());

        double puzzlesPrice = puzzles * 2.60;
        double dollsPrice = dolls * 3.00;
        double bearsPrice = bears * 4.10;
        double minionsPrice = minions * 8.20;
        double trucksPrice = trucks * 2.00;


        double allToys = puzzles + dolls + bears + minions + trucks;
        double sum = puzzlesPrice + dollsPrice + bearsPrice + minionsPrice + trucksPrice;

        if (allToys >= 50){
            sum = sum - (sum * 0.25);
        }

        double sumMinusRent = sum - (sum*0.10);

        if (sumMinusRent >= travel){
            System.out.printf("Yes! %.2f lv left.",sumMinusRent-travel);
        } else {
            System.out.printf("Not enough money! %2.2f lv needed.", travel - sumMinusRent);
        }
    }
}
