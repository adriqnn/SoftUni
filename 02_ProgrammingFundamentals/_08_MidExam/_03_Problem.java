package _02_ProgrammingFundamentals._08_MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class _03_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] priceRatings = Arrays.stream(scan.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int entryIndex = Integer.parseInt(scan.nextLine());
        String value = scan.nextLine();

        // Add variables
        int cheapValueLeft = 0;
        int expensiveValueLeft = 0;

        // Determine prices
        for (int i = 0; i < entryIndex; i++) {
            int valueNumber = priceRatings[entryIndex];

            if (priceRatings[i] < valueNumber) {
                cheapValueLeft += priceRatings[i];
            } else if (priceRatings[i] >= valueNumber) {
                expensiveValueLeft += priceRatings[i];
            }
        }

        int cheapValueRight = 0;
        int expensiveValueRight = 0;

        for (int i = entryIndex + 1; i < priceRatings.length; i++) {
            int valueNumber = priceRatings[entryIndex];
            
            if (priceRatings[i] < valueNumber) {
                cheapValueRight += priceRatings[i];
            } else if (priceRatings[i] >= valueNumber) {
                expensiveValueRight += priceRatings[i];
            }
        }

        // Print result
        if (value.equals("cheap")) {
            if (cheapValueLeft >= cheapValueRight) {
                System.out.printf("Left - %d", cheapValueLeft);
            } else if (cheapValueLeft < cheapValueRight) {
                System.out.printf("Right - %d", cheapValueRight);
            }
        } else if (value.equals("expensive")) {
            if (expensiveValueLeft >= expensiveValueRight) {
                System.out.printf("Left - %d", expensiveValueLeft);
            } else if (expensiveValueLeft < expensiveValueRight) {
                System.out.printf("Right - %d", expensiveValueRight);
            }
        }

        scan.close();
    }
}
