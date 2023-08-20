package _01_ProgrammingBasics._04_LoopsPartOneMoreExercises;

import java.util.Scanner;

public class _06_Bills {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int numberOfMonths = Integer.parseInt(scan.nextLine());

        // Add variables
        double electricityBill = 0;
        double waterBill = numberOfMonths * 20;
        double internetBill = numberOfMonths * 15;
        double otherBills = 0;

        // Process each month's bills and calculate expenses
        for (int i = 0; i < numberOfMonths; i++) {
            double monthlyElectricityBill = Double.parseDouble(scan.nextLine());

            electricityBill += monthlyElectricityBill;
            otherBills += (monthlyElectricityBill + 20 + 15) * 1.2;
        }

        double allExpenses = electricityBill + waterBill + internetBill + otherBills;

        // Print the expenses and average
        System.out.printf("Electricity: %.2f lv%n", electricityBill);
        System.out.printf("Water: %.2f lv%n", waterBill);
        System.out.printf("Internet: %.2f lv%n", internetBill);
        System.out.printf("Other: %.2f lv%n", otherBills);
        System.out.printf("Average: %.2f lv %n", allExpenses / numberOfMonths);

        scan.close();
    }
}
