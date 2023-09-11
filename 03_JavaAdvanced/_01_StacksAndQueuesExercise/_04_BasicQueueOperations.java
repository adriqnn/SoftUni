package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();

        // Add variable
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(scan.nextInt());
        }
        for (int i = 1; i <= s; i++) {
            queue.poll();
        }

        // Print result
        if(queue.contains(x)){
            System.out.println("true");
        }else{
            if(!queue.isEmpty()){
                System.out.println(Collections.min(queue));
            }else{
                System.out.println("0");
            }
        }

        scan.close();
    }
}
