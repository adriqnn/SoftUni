package _01_Programming_Basics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _04_FishingBoat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int budget = Integer.parseInt(scan.nextLine());
        String season = scan.nextLine();
        int ppl = Integer.parseInt(scan.nextLine());

        double price = 0;
        boolean isValid = season.equals("Autumn");

        switch (season) {
            case "Spring":
                price= 3000;
                if (ppl<=6){
                    price *=0.90;
                }else if (ppl<=11){
                    price *=0.85;
                }else{
                    price *=0.75;
                }
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                if (ppl<=6){
                    price *=0.90;
                }else if (ppl<=11){
                    price *=0.85;
                }else{
                    price *=0.75;
                }
                break;
            case "Winter":
                price = 2600;
                if (ppl<=6){
                    price *=0.90;
                }else if (ppl<=11){
                    price *=0.85;
                }else{
                    price *=0.75;
                }
                break;
        }
        if (isValid) {
            price*=1.00;
        }else {
            if (ppl % 2 == 0) {
                price *= 0.95;
            } else {
                price *= 1.00;
            }
        }
        double sum = budget - price;

        if(budget>=price){
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(sum));
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(sum));
        }
    }
}
