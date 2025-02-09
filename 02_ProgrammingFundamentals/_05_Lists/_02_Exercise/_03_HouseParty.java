package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scan.nextLine());

        // Add variable
        List<String> partyList = new ArrayList<>();

        // Determine who is going to the party
        for (int i = 0; i < n; i++) {
            String[] commandline = scan.nextLine().split("\\s+");

            if (commandline[2].equals("going!")) {
                if (!partyList.contains(commandline[0])) {
                    partyList.add(commandline[0]);
                } else {
                    System.out.printf("%s is already in the list!%n", commandline[0]);
                }
            } else {
                if (partyList.contains(commandline[0])) {
                    partyList.remove(commandline[0]);
                } else {
                    System.out.printf("%s is not in the list!%n", commandline[0]);
                }
            }
        }

        // Print result
        partyList.stream().forEach(System.out::println);

        scan.close();
    }
}
