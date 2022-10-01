package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> liliesStack = new ArrayDeque<>();
        Deque<Integer> rosesQueue = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).forEach(liliesStack::push);
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).forEach(rosesQueue::offer);
        int store = 0;
        int wreaths = 0;
        while(!liliesStack.isEmpty() && !rosesQueue.isEmpty()){
            int l = liliesStack.peek();
            int r = rosesQueue.peek();
            int sum = l + r;
            while(sum > 15 && l > 1){
                l -= 2;
                sum = l + r;
            }
            liliesStack.pop();
            rosesQueue.poll();
            if(sum == 15){
                wreaths++;
            }else{
                store += sum;
            }
        }
        wreaths += store/15;
        if(wreaths >= 5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!%n",wreaths);
        }else{
            System.out.printf("You didn't make it, you need %d wreaths more!%n",5-wreaths);
        }
    }
}
