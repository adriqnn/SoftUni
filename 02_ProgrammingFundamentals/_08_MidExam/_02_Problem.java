package _02_ProgrammingFundamentals._08_MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> friendList = Arrays.stream(scan.nextLine().split(", ")).collect(Collectors.toList());
        String console = scan.nextLine();

        // Add variables
        int blacklisted = 0;
        int lost = 0;

        // Execute commands
        while (!console.equals("Report")) {
            String[] input = console.split(" ");

            if (input[0].equals("Blacklist")) {
                String name = input[1];
                boolean noName = true;

                for (int i = 0; i < friendList.size(); i++) {
                    if (friendList.get(i).equals(name)) {
                        friendList.set(i, "Blacklisted");
                        blacklisted++;

                        System.out.printf("%s was blacklisted.%n", name);
                        noName = false;
                    }
                }

                if (noName) {
                    System.out.printf("%s was not found.%n", name);
                }
            } else if (input[0].equals("Error")) {
                int n = Integer.parseInt(input[1]);

                if (n >= 0 && n <= friendList.size() - 1) {
                    if (!friendList.get(n).equals("Blacklisted") && !friendList.get(n).equals("Lost")) {
                        String name = friendList.get(n);
                        friendList.set(n, "Lost");
                        lost++;

                        System.out.printf("%s was lost due to an error.%n", name);
                    }
                }
            } else if (input[0].equals("Change")) {
                int n = Integer.parseInt(input[1]);
                String newName = input[2];

                if (n >= 0 && n <= friendList.size() - 1) {
                    String name = friendList.get(n);
                    friendList.set(n, newName);

                    System.out.printf("%s changed his username to %s.%n", name, newName);
                }
            }

            console = scan.nextLine();
        }

        // Print result
        System.out.printf("Blacklisted names: %d%n", blacklisted);
        System.out.printf("Lost names: %d%n", lost);
        System.out.println(friendList.toString().replaceAll("[\\[\\],]", ""));

        scan.close();
    }
}
