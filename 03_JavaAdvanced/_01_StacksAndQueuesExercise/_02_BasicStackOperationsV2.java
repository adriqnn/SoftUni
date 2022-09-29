package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class _02_BasicStackOperationsV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = scan.nextInt();
        int s = scan.nextInt();
        int x = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            stack.push(scan.nextInt());
        }
        for (int i = 1; i <= s; i++) {
            stack.pop();
        }
        if(stack.contains(x)){
            System.out.println("true");
        }else{
            if(!stack.isEmpty()){
                System.out.println(Collections.min(stack));
            }else{
                System.out.println("0");
            }
        }
    }
}
