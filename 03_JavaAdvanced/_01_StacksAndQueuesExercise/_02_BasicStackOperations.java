package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class _02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] lineOfNumbers = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int elementsToPush = lineOfNumbers[0];
        int elementsToPop = lineOfNumbers[1];
        int elementPresent = lineOfNumbers[2];
        int[] stackLine = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(stackLine).forEach(stack::push);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            int n = stack.pop();
            if(n == elementPresent){
                System.out.println("true");
                return;
            }
            if(n < min){
                min = n;
            }
        }
        if (stack.size() == 0 && min == Integer.MAX_VALUE){
            System.out.println("0");
        }else {
            System.out.println(min);
        }
    }
}
