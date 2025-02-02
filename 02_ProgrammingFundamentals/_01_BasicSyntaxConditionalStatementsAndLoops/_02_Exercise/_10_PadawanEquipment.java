package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double budget = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double sabers = Double.parseDouble(scan.nextLine());
        double robes = Double.parseDouble(scan.nextLine());
        double belts = Double.parseDouble(scan.nextLine());

        // Add variable
        int count = 0;

        // Every 6th student
        for (int i = 0; i < students; i = i + 6) {
            count++;
        }

        // More calculations
        double sabers2 = Math.ceil(students * 1.10) * sabers;
        double robes2 = students * robes;
        double belts2 = (students - (count - 1)) * belts;
        double total = sabers2 + robes2 + belts2;

        // Print result
        if (total <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.", total);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", total - budget);
        }

        scan.close();
    }
}
