package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _07_Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());
        double gpus = Double.parseDouble(scan.nextLine());
        double processors = Double.parseDouble(scan.nextLine());
        int memorySticks = Integer.parseInt(scan.nextLine());

        double gpusPrice = gpus * 250;
        double processorsPrice = processors * (gpusPrice * 0.35);
        double memoryPrice = memorySticks * (gpusPrice * 0.1);
        double totalPrice = gpusPrice + processorsPrice + memoryPrice;

        if(gpus > processors){
            totalPrice *= 0.85;
        }

        if(totalPrice <= budget){
            System.out.printf("You have %.2f leva left!", budget - totalPrice);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", totalPrice - budget);
        }
    }
}
