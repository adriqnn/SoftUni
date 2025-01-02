package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        double vacationCost = Double.parseDouble(scan.nextLine());
        double initialMoney = Double.parseDouble(scan.nextLine());

        // Add variables
        int daysSpent = 0;
        int daysPassed = 0;

        // Use a while loop to track the progress of saving money for the vacation
        while (initialMoney < vacationCost) {
            String action = scan.nextLine();
            double amount = Double.parseDouble(scan.nextLine());

            daysPassed++;

            if (action.equals("save")) {
                daysSpent = 0;
                initialMoney += amount;
            } else if (action.equals("spend")) {
                daysSpent++;
                initialMoney -= amount;

                if (initialMoney < 0) {
                    initialMoney = 0;
                }
            }

            if (daysSpent == 5) {
                System.out.printf("You can't save the money.%n%d", daysPassed);
                break;
            }
        }

        // Display the result based on whether the vacation cost was met
        if (initialMoney >= vacationCost) {
            System.out.printf("You saved the money for %d days.", daysPassed);
        }

        scan.close();
    }
}
