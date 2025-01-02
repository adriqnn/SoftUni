package _01_ProgrammingBasics._05_LoopsPartTwoMoreExercises;

import java.util.Scanner;

public class _01_Dishwasher {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int detergent = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        // Add variables
        int detergentQuantity = detergent * 750;
        int washingBatch = 1;
        int plates = 0;
        int pots = 0;

        // Operations
        while (!input.equals("End")) {
            int dishes = Integer.parseInt(input);
            int detergentNeeded = 0;

            // Determine whether the dishes are plates or pots
            if (washingBatch % 3 == 0) {
                pots += dishes;
                detergentNeeded += dishes * 15;
            } else {
                plates += dishes;
                detergentNeeded += dishes * 5;
            }
            
            washingBatch++;

            // Check if there's enough detergent for the current batch
            if (detergentQuantity - detergentNeeded < 0) {
                System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentQuantity - detergentNeeded));
                break;
            } else {
                detergentQuantity -= detergentNeeded;
            }

            input = scan.nextLine();
        }

        // Display the results
        if (input.equals("End")) {
            System.out.printf("Detergent was enough!%n");
            System.out.printf("%d dishes and %d pots were washed.%n", plates, pots);
            System.out.printf("Leftover detergent %d ml.", detergentQuantity);
        }

        scan.close();
    }
}
