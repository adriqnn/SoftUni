package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Add variable
        ArrayDeque<String> stackOfInputNumbers = new ArrayDeque<>();

        // Read input values
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(stackOfInputNumbers::push);

        // Reverse numbers array and print result
        while(!stackOfInputNumbers.isEmpty()){
            System.out.print(stackOfInputNumbers.pop() + " ");
        }

        scan.close();
    }
}
