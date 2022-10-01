package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bombs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> effectsQueue = new ArrayDeque<>();
        Deque<Integer> casingStack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).forEach(effectsQueue::offer);
        Arrays.stream(scan.nextLine().split(", ")).map(Integer::parseInt).forEach(casingStack::push);
        int b40 = 0;
        int b60 = 0;
        int b120 = 0;
        while(!effectsQueue.isEmpty() && !casingStack.isEmpty()){
            int e = effectsQueue.peek();
            int c = casingStack.peek();
            int sum = e + c;
            casingStack.pop();
            if(sum == 40){
                effectsQueue.poll();
                b40++;
            }else if(sum == 60){
                effectsQueue.poll();
                b60++;
            }else if(sum == 120){
                effectsQueue.poll();
                b120++;
            }else{
                c -= 5;
                if(c >= 0) {
                    casingStack.push(c);
                }
            }
            if(b40 >= 3 && b60 >= 3 && b120 >= 3){
                break;
            }

        }
        if(b40 >= 3 && b60 >= 3 && b120 >= 3){
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        }else{
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        }
        if(effectsQueue.isEmpty()){
            System.out.println("Bomb Effects: empty");
        }else{
            System.out.print("Bomb Effects: ");
            System.out.print(effectsQueue.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.println();
        }
        if(casingStack.isEmpty()){
            System.out.println("Bomb Casings: empty");
        }else{
            System.out.print("Bomb Casings: ");
            System.out.print(casingStack.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.println();
        }
        System.out.printf("Cherry Bombs: %d%n",b60);
        System.out.printf("Datura Bombs: %d%n",b40);
        System.out.printf("Smoke Decoy Bombs: %d%n",b120);
    }
}
