package _02_ProgrammingFundamentals._12_ExamPrep._01_ExamPrep;

import java.util.Scanner;

public class _01_WorldTour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        StringBuilder initialDestination = new StringBuilder(scan.nextLine());
        String command = scan.nextLine();

        // Determine world tour route
        while (!command.equals("Travel")) {
            String[] input = command.split(":");

            String switchCommand = input[0];

            switch (switchCommand) {
                case "Add Stop":
                    int index1 = Integer.parseInt(input[1]);
                    String addString = input[2];

                    if (indexIsValid(index1, initialDestination.toString())) {
                        initialDestination.insert(index1, addString);

                        System.out.println(initialDestination);
                    }

                    break;
                case "Remove Stop":
                    int index2 = Integer.parseInt(input[1]);
                    int index3 = Integer.parseInt(input[2]);

                    if (indexIsValid(index2, initialDestination.toString()) && indexIsValid(index3, initialDestination.toString())) {
                        initialDestination.delete(index2, index3 + 1);
                    }

                    System.out.println(initialDestination);
                    break;
                case "Switch":
                    String oldString = input[1];
                    String newString = input[2];

                    String destinationAsString = initialDestination.toString();
                    destinationAsString = destinationAsString.replaceAll(oldString, newString);
                    initialDestination = new StringBuilder(destinationAsString);

                    System.out.println(initialDestination);
                    break;
            }
            
            command = scan.nextLine();
        }

        // Print result
        System.out.printf("Ready for world tour! Planned stops: %s", initialDestination);

        scan.close();
    }

    public static boolean indexIsValid(int index, String text) {
        return index >= 0 && index < text.length();
    }
}
