package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MagicBox {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> stack = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(queue::offer);
        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(stack::push);

        int value = 0;
        while(!queue.isEmpty() && !stack.isEmpty()){
            int first = queue.peek();
            int second = stack.peek();

            if ((first + second) % 2 == 0){
                value += queue.poll() + stack.pop();
            }else{
                queue.offer(stack.pop());
            }
        }
        
        if(queue.isEmpty()){
            System.out.println("First magic box is empty.");
        }else{
            System.out.println("Second magic box is empty.");
        }
        
        if(value >= 90 ){
            System.out.println("Wow, your prey was epic! Value: " + value);
        }else{
            System.out.println("Poor prey... Value: " + value);
        }
        
        scan.close();
    }
}
