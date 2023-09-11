package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.Scanner;

public class _06_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input value
        int num = Integer.parseInt(scan.nextLine());
        
        // Print fibonacci
        printRecursiveFibonacci(num);
        
        scan.close();
    }
    
    // Method that prints fibonacci
    private static void printRecursiveFibonacci(int num) {
        if (num == 0){
            System.out.println("0");
            return;
        }
        
        long number1InSequence = 1;
        long number2InSequence = 1;
        
        for (int i = 1; i < num; i++) {
            long temporary = number2InSequence;
            number2InSequence = number1InSequence + number2InSequence;
            number1InSequence = temporary;
        }
        
        System.out.println(number2InSequence);
    }
}
