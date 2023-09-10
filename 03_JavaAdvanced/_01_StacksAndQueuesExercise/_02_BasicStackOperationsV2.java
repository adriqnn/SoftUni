package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_BasicStackOperationsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();

        // Add variable
        ArrayDeque<Integer> stackOfIntegers = new ArrayDeque<>();

        // Populate the stack
        for (int i = 1; i <= n; i++) {
            stackOfIntegers.push(scan.nextInt());
        }

        // Pop s number of elements from the stack
        for (int i = 1; i <= s; i++) {
            stackOfIntegers.pop();
        }

        // Print result
        if(stackOfIntegers.contains(x)){
            System.out.println("true");
        }else{
            if(!stackOfIntegers.isEmpty()){
                System.out.println(Collections.min(stackOfIntegers));
            }else{
                System.out.println("0");
            }
        }

        scan.close();
    }
}
