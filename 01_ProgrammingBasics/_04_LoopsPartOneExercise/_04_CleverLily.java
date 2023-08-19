package _01_ProgrammingBasics._04_LoopsPartOneExercise;

import java.util.Scanner;

public class _04_CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int age = Integer.parseInt(scan.nextLine());
        double washMachinePrice = Double.parseDouble(scan.nextLine());
        double toyPrice = Double.parseDouble(scan.nextLine());

        int toysCounter = 0;
        double sumMoney = 0;
        double money = 0;
        int count = 0;

        // Calculate the number of toys received and money saved for each birthday
        for (int i = 1; i <= age; i++) {
            if (i % 2 != 0) {
                toysCounter++;
            } else {
                money += 10;
                sumMoney += money;
                count++;
            }
        }

        // Calculate the total money from selling the toys and saved money
        double allToysMoney = toyPrice * toysCounter;
        double totalMoney = allToysMoney + sumMoney - count;
        double diff = Math.abs(totalMoney - washMachinePrice);

        // Determine if Lily can buy the washing machine and print the result
        if (totalMoney >= washMachinePrice) {
            System.out.printf("Yes! %.2f%n", diff);
        } else {
            System.out.printf("No! %.2f%n", diff);
        }

        scan.close();
    }
}
