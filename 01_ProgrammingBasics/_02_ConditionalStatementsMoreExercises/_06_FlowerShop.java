package _01_ProgrammingBasics._02_ConditionalStatementsMoreExercise;

import java.util.Scanner;

public class _06_FlowerShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int magnolias = Integer.parseInt(scan.nextLine());
        int hyacinths = Integer.parseInt(scan.nextLine());
        int roses = Integer.parseInt(scan.nextLine());
        int cacti = Integer.parseInt(scan.nextLine());
        double presentCost = Double.parseDouble(scan.nextLine());

        // Calculate total price for flowers
        double totalPriceForFlowers = ((magnolias * 3.25) + (hyacinths * 4) + (roses * 3.5) + (cacti * 8)) * 0.95;

        // Calculate the difference between present cost and flower cost
        double enoughMoney = presentCost - totalPriceForFlowers;

        // Print the result
        if (enoughMoney > 0) {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(enoughMoney));
        } else {
            System.out.printf("She is left with %.0f leva.", Math.floor(Math.abs(enoughMoney)));
        }

        scan.close();
    }
}
