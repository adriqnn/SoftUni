package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add variable
        ArrayDeque<String> stack = new ArrayDeque<>();
        
        // Read input values
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(stack::push);
        
        // Reverse numbers array
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
        
        scan.close();
    }
}
