package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Scanner;

public class _07_MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] players = scan.nextLine().split("\\s+");
        int turns = Integer.parseInt(scan.nextLine());

        // Add variable
        ArrayDeque<String> queueOfPlayers = new ArrayDeque<>();

        // Create queue
        for (String e : players) {
            queueOfPlayers.offer(e);
        }

        int cycle = 1;

        // Play the game
        while(queueOfPlayers.size() > 1){
            for (int i = 1; i < turns; i++) {
                queueOfPlayers.offer(Objects.requireNonNull(queueOfPlayers.poll()));
            }

            if(isPrime(cycle)){
                System.out.println("Prime " + queueOfPlayers.peek());
            }else {
                System.out.println("Removed " + queueOfPlayers.poll());
            }

            cycle ++;
        }

        // Print result
        System.out.println("Last is " + queueOfPlayers.poll());

        scan.close();
    }

    // Method that determines if a number is a prime or not
    private static boolean isPrime(int cycle) {
        if (cycle <= 1){
            return false;
        }
        
        for (int i = 2; i < cycle; i++) {
            if(cycle % i == 0){
                return false;
            }
        }
        
        return true;
    }
}
