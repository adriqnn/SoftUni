package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] inputExpression = scan.nextLine().split("\\s+");

        // Add variables
        ArrayDeque<String> inputExpressionValues = new ArrayDeque<>();
        Collections.addAll(inputExpressionValues, inputExpression);

        // Read array with for loop
        /*String[] inputExpression = scan.nextLine().split("\\s+");
        for (String s : inputExpression) {
            inputExpressionValues.push(s);
        }*/

        // Read array and push values to a deque
        //Arrays.stream(scan.nextLine().split("\\s+")).forEach(inputExpressionValues::push);

        //Read array and push values to a newly created deque
        //Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new)).forEach(inputExpressionValues::push);

        // Execute calculations
        while (inputExpressionValues.size() > 1){
            int firstValue = Integer.parseInt(inputExpressionValues.pop());
            String operation = inputExpressionValues.pop();
            int secondValue = Integer.parseInt(inputExpressionValues.pop());

            switch(operation){
                case "+": inputExpressionValues.push(String.valueOf(firstValue + secondValue));
                    break;
                case "-": inputExpressionValues.push(String.valueOf(firstValue - secondValue));
                    break;
            }
        }

        // Print result
        System.out.println(inputExpressionValues.pop());

        scan.close();
    }
}
