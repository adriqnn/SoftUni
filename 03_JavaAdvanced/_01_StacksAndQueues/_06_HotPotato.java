package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class _06_HotPotato {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] players = scan.nextLine().split("\\s+");
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        ArrayDeque<String> queue = new ArrayDeque<>();

        // Create queue
        for (String e : players) {
            queue.offer(e);
        }

        // Play the game
        while(queue.size() > 1){
            for (int i = 1; i < n; i++) {
                queue.offer(queue.poll());
            }

            System.out.println("Removed " + queue.poll());
        }

        // Print result
        System.out.println("Last is " + queue.poll());
        
        scan.close();
    }
}
