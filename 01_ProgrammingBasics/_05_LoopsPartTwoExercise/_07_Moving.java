package _01_ProgrammingBasics._05_LoopsPartTwoExercise;

import java.util.Scanner;

public class _07_Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int height = Integer.parseInt(scan.nextLine());

        // Add variables
        int volume = width * length * height;
        int boxesSum = 0;

        String input = scan.nextLine();

        // Determine how many boxes are needed for the moving
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            boxesSum += boxes;

            if (boxesSum >= volume) {
                break;
            }

            input = scan.nextLine();
        }

        // Display the remaining or excess space in the room
        int diff = Math.abs(boxesSum - volume);

        // Print result 
        if (boxesSum >= volume) {
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }

        scan.close();
    }
}
