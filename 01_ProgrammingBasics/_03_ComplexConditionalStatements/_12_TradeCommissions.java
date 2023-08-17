package _01_ProgrammingBasics._03_ComplexConditionalStatements;

import java.util.Scanner;

public class _12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values for city and money
        String city = scan.nextLine();
        double money = Double.parseDouble(scan.nextLine());

        // Check if the input values are valid
        boolean isValidCity = city.equals("Sofia") || city.equals("Varna") || city.equals("Plovdiv");
        boolean isValidMoney = money >= 0;

        // End the program if invalid data is entered
        if (!isValidCity || !isValidMoney) {
            System.out.println("error");
            return;
        }

        // Commission for the trade
        double commission = 0.0;

        // Calculate the commission
        switch (city) {
            case "Sofia":
                if (money <= 500) {
                    commission = money * 0.05;
                } else if (money <= 1000) {
                    commission = money * 0.07;
                } else if (money <= 10000) {
                    commission = money * 0.08;
                } else {
                    commission = money * 0.12;
                }
                break;
            case "Varna":
                if (money <= 500) {
                    commission = money * 0.045;
                } else if (money <= 1000) {
                    commission = money * 0.075;
                } else if (money <= 10000) {
                    commission = money * 0.10;
                } else {
                    commission = money * 0.13;
                }
                break;
            case "Plovdiv":
                if (money <= 500) {
                    commission = money * 0.055;
                } else if (money <= 1000) {
                    commission = money * 0.08;
                } else if (money <= 10000) {
                    commission = money * 0.12;
                } else {
                    commission = money * 0.145;
                }
                break;
        }

        // Print the commission
        System.out.printf("%.2f", commission);
        
        scan.close();
    }
}
