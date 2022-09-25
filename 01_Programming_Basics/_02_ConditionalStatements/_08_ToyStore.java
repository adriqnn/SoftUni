package _01_Programming_Basics._02_ConditionalStatements;

import java.util.Scanner;

public class _08_ToyStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Puzzle-2.60/TalkingDoll-3.00/Bear-4.10/Minion-8.20/Truck-2.00/
        //50 or more - 25% discount;10% from profit for rent
        double travel = Double.parseDouble(scan.nextLine());
        int puzzles = Integer.parseInt(scan.nextLine());
        int dolls = Integer.parseInt(scan.nextLine());
        int bears = Integer.parseInt(scan.nextLine());
        int minions = Integer.parseInt(scan.nextLine());
        int trucks = Integer.parseInt(scan.nextLine());

        double puzzles2 = puzzles * 2.60;
        double dolls2 = dolls * 3.00;
        double bears2 = bears * 4.10;
        double minions2 = minions * 8.20;
        double trucks2 = trucks * 2.00;

        double allToys = puzzles + dolls + bears + minions + trucks;
        double sum = puzzles2 + dolls2 + bears2 + minions2 + trucks2;

        if (allToys >= 50){
            sum = sum - (sum*0.25);
        }
        double sumMinusRent = sum - (sum*0.10);

        if (sumMinusRent >= travel){
            System.out.printf("Yes! %.2f lv left.",sumMinusRent-travel);
        } else {
            System.out.printf("Not enough money! %2.2f lv needed", travel - sumMinusRent);
        }
    }
}
