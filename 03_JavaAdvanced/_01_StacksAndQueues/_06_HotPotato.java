package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class _06_HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] players = scan.nextLine().split("\\s+");
        int turns = Integer.parseInt(scan.nextLine());

        // Add variables
        ArrayDeque<String> queueOfPlayers = new ArrayDeque<>();

        // Create queue
        for (String e : players) {
            queueOfPlayers.offer(e);
        }

        // Play the game
        while(queueOfPlayers.size() > 1){
            for (int i = 1; i < turns; i++) {
                queueOfPlayers.offer(Objects.requireNonNull(queueOfPlayers.poll()));
            }

            System.out.println("Removed " + queueOfPlayers.poll());
        }

        // Print result
        System.out.println("Last is " + queueOfPlayers.poll());

        scan.close();
    }
}
