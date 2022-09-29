package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class _03_MaximumElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        Deque<Long> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] commandLine = scan.nextLine().split("\\s+");
            String command = commandLine[0];
            if(command.equals("1")){
                stack.push(Long.parseLong(commandLine[1]));
            }else if(command.equals("2")){
                if(stack.isEmpty()){
                    continue;
                }else{
                    stack.pop();
                }
            }else if(command.equals("3")){
                if(stack.isEmpty()){
                    continue;
                }else{
                    System.out.println(Collections.max(stack));
                }
            }
        }
    }
}
