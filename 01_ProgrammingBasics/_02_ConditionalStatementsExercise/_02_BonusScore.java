package _01_ProgrammingBasics._02_ConditionalStatementsExercise;

import java.util.Scanner;

public class _02_BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the input number
        int inputNumber = Integer.parseInt(scan.nextLine());
        double bonus = 0;

        // Calculate bonus based on the input number
        if (inputNumber <= 100) {
            bonus = 5;
        } else if (inputNumber > 1000) {
            bonus = inputNumber * 0.1;
        } else {
            bonus = inputNumber * 0.2;
        }

        // Adjust bonus based on additional conditions
        if (inputNumber % 2 == 0) {
            bonus = bonus + 1;
        } else if (inputNumber % 10 == 5) {
            bonus = bonus + 2;
        }

        // Print the bonus and total score
        System.out.println(bonus);
        System.out.println(inputNumber + bonus);
        
        scan.close();
    }
}
