package _03_JavaAdvanced._01_StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack,tokens);
        /*String[] input = scan.nextLine().split("\\s+");
        for (String s : input) {
            stack.push(s);
        }*/
        //Arrays.stream(scan.nextLine().split("\\s+")).forEach(stack::push);
        //Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toCollection(ArrayDeque::new)).forEach(stack::push);
        while (stack.size() > 1){
            int first = Integer.valueOf(stack.pop());
            String operation = stack.pop();
            int second = Integer.valueOf(stack.pop());
            switch(operation){
                case "+": stack.push(String.valueOf(first+second));
                    break;
                case "-": stack.push(String.valueOf(first-second));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
