package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Bouquets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Deque<Integer> tulipsStack = new ArrayDeque<>();
        Deque<Integer> daffodilsQueue = new ArrayDeque<>();
        
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).forEach(tulipsStack::push);
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).forEach(daffodilsQueue::offer);

        int store = 0;
        int bouquets = 0;
        
        while(!tulipsStack.isEmpty() && !daffodilsQueue.isEmpty()){
            int t = tulipsStack.peek();
            int d = daffodilsQueue.peek();
            int sum = t + d;
             
            while(t + d > 15 && t > 1){
                t -= 2;
                sum = t + d;
            }
            
            if(sum == 15){
                bouquets++;
            }else if(sum < 15){
                store += sum;
            }
            
            tulipsStack.pop();
            daffodilsQueue.poll();
        }
        
        bouquets += (store / 15);
        
        if(bouquets >= 5){
            System.out.printf("You made it! You go to the competition with %d bouquets!%n", bouquets);
        }else{
            System.out.printf("You failed... You need more %d bouquets.%n", 5 - bouquets);
        }

        scan.close();
    }
}
