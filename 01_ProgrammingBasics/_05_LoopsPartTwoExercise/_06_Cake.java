package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _06_Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        String console = scan.nextLine();

        // Add variables
        int wholeCake = width * length;
        int remainingCake = wholeCake;
        int totalSlices = 0;

        // Using while manage the slices of the cake
        while (!console.equals("STOP")) {
            int slices = Integer.parseInt(console);

            // Update the remaining cake and total slices taken
            remainingCake -= slices;
            totalSlices += slices;

            if (remainingCake <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(wholeCake - totalSlices));
                break;
            }

            console = scan.nextLine();
        }

        // Display the remaining pieces if the user stopped
        if (console.equals("STOP")) {
            System.out.printf("%d pieces are left.", remainingCake);
        }

        scan.close();
    }
}
