package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _04_ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String console = scan.nextLine();

        // Transform the list based on the given commands
        while (!console.equals("End")) {
            String[] commandLine = console.split("\\s+");

            if (commandLine[0].equals("Add")) {
                numbersList.add(Integer.parseInt(commandLine[1]));
            } else if (commandLine[0].equals("Insert")) {
                if (Integer.parseInt(commandLine[2]) >= 0 && Integer.parseInt(commandLine[2]) < numbersList.size()) {
                    numbersList.add(Integer.parseInt(commandLine[2]), Integer.parseInt(commandLine[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandLine[0].equals("Remove")) {
                if (Integer.parseInt(commandLine[1]) >= 0 && Integer.parseInt(commandLine[1]) < numbersList.size()) {
                    numbersList.remove(Integer.parseInt(commandLine[1]));
                } else {
                    System.out.println("Invalid index");
                }
            } else if (commandLine[0].equals("Shift")) {
                int n = Integer.parseInt(commandLine[2]);

                if (commandLine[1].equals("left")) {
                    for (int i = 0; i < n; i++) {
                        numbersList.add(numbersList.get(0));
                        numbersList.remove(0);
                    }
                } else if (commandLine[1].equals("right")) {
                    for (int i = 0; i < n; i++) {
                        numbersList.add(0,numbersList.get(numbersList.size() - 1));
                        numbersList.remove(numbersList.size() - 1);
                    }
                }
            }

            console = scan.nextLine();
        }

        //Print result
        numbersList.stream().forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
