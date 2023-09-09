package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _07_MathPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] input = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        ArrayDeque<String> players = new ArrayDeque<>();

        // Create queue
        for (String child : input) {
            players.offer(child);
        }

        int cycle = 1;

        // Play the game
        while(players.size() > 1){
            for (int i = 1; i < n; i++) {
                players.offer(players.poll());
            }

            if(isPrime(cycle)){
                System.out.println("Prime " + players.peek());
            }else {
                System.out.println("Removed " + players.poll());
            }

            cycle ++;
        }

        // Print result
        System.out.println("Last is " + players.poll());

        scan.close();
    }

    // Method that determines if a number is a prime or not
    private static boolean isPrime(int cycle) {
        if (cycle <= 1){
            return false;
        }
        for (int i = 2; i < cycle; i++) {
            if(cycle%i == 0){
                return false;
            }
        }
        return true;
    }
}
