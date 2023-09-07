package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input values
        String[] tokens = scan.nextLine().split("\\s+");
        
        // Add variables
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack,tokens);

        // Read array with for loop
        /*String[] input = scan.nextLine().split("\\s+");
        for (String s : input) {
            stack.push(s);
        }*/

        // Read array and push values to a deque
        //Arrays.stream(scan.nextLine().split("\\s+")).forEach(stack::push);

        //Read array and push values to a newly created deque
        //Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new)).forEach(stack::push);
        
        // Execute calculations
        while (stack.size() > 1){
            int first = Integer.valueOf(stack.pop());
            String operation = stack.pop();
            int second = Integer.valueOf(stack.pop());
            
            switch(operation){
                case "+": stack.push(String.valueOf(first + second));
                    break;
                case "-": stack.push(String.valueOf(first - second));
                    break;
            }
        }
        
        // Print result
        System.out.println(stack.pop());
        
        scan.close();
    }
}
