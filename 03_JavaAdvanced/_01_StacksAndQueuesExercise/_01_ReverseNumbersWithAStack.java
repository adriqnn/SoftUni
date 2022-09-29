package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split("\\s+")).forEach(stack::push);
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
