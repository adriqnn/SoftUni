package _02_ProgrammingFundamentals._07_MidExamPrep._01_MidExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_MemoryGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<String> game = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());
        String console = scan.nextLine();

        // Add variable
        int round = 0;

        // Play the game
        while (!console.equals("end")) {
            String[] hmm = console.split(" ");
            int[] input = Arrays.stream((hmm)).mapToInt(e -> Integer.parseInt(e)).toArray();

            if (input[0] == input[1]) {
                round++;

                String add = "-" + round + "a";
                game.add(game.size() / 2, add);
                game.add(game.size() / 2, add);

                System.out.println("Invalid input! Adding additional elements to the board");
                console = scan.nextLine();
                continue;
            }

            if (input[0] < 0 || input[0] > game.size() - 1) {
                round++;

                String add = "-" + round + "a";
                game.add(game.size() / 2, add);
                game.add(game.size() / 2, add);

                System.out.println("Invalid input! Adding additional elements to the board");
                console = scan.nextLine();
                continue;
            }

            if (input[1] < 0 || input[1] > game.size() - 1) {
                round++;

                String add = "-" + round + "a";
                // String add = String.format("-%da", round);
                game.add(game.size() / 2, add);
                game.add(game.size() / 2, add);

                System.out.println("Invalid input! Adding additional elements to the board");
                console = scan.nextLine();
                continue;
            }

            if (game.get(input[0]).equals(game.get(input[1]))) {
                round++;
                String element = game.get(input[0]);
                game.remove(Math.max(input[0], input[1]));
                game.remove(Math.min(input[0], input[1]));

                System.out.printf("Congrats! You have found matching elements - %s!%n", element);
                console = scan.nextLine();

                if (game.isEmpty()) {
                    System.out.printf("You have won in %d turns!%n", round);
                    break;
                }

                continue;
            }

            if (!game.get(input[0]).equals(game.get(input[1]))) {
                round++;

                System.out.println("Try again!");
                console = scan.nextLine();
                continue;
            }

            console = scan.nextLine();
        }

        // Print result
        if (console.equals("end") && !game.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.println(game.toString().replaceAll("[\\[\\],]", ""));
        }

        scan.close();
    }
}
