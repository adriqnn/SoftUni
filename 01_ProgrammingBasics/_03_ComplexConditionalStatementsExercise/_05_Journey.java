package _01_ProgrammingBasics._03_ComplexConditionalStatementsExercise;

import java.util.Scanner;

public class _05_Journey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        double price = 0;
        String place = "";
        String place2 = "";

        if (budget<=100){
            place = "Bulgaria";
            if(season.equals("summer")){
                place2 = "Camp";
                price = budget*0.30;
            }else if(season.equals("winter")){
                place2 = "Hotel";
                price = budget*0.70;
            }
        }else if (budget<=1000){
            place = "Balkans";
            if(season.equals("summer")){
                place2 = "Camp";
                price = budget*0.40;
            }else if(season.equals("winter")){
                place2 = "Hotel";
                price = budget*0.80;
            }
        }else {
            place = "Europe";
            place2 = "Hotel";
            price = budget*0.90;
        }

        double sum = budget - price;

        if (budget >= price){
            System.out.printf("Somewhere in %s\n", place);
            System.out.printf("%s - %.2f", place2, price);
        }
    }
}
