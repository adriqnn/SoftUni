package _03_JavaAdvanced._11_Exam;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> bucketsOfIngredientsQueue = new ArrayDeque<>();
        Deque<Integer> freshnessLevelStack = new ArrayDeque<>();
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(bucketsOfIngredientsQueue::offer);
        Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).forEach(freshnessLevelStack::push);
        int ps = 0;
        int th = 0;
        int ah = 0;
        int hf = 0;
        while(!bucketsOfIngredientsQueue.isEmpty() && !freshnessLevelStack.isEmpty()){
            int buckets = bucketsOfIngredientsQueue.peek();
            int freshness = freshnessLevelStack.peek();
            if(buckets == 0 ) {
                bucketsOfIngredientsQueue.poll();
                continue;
            }
            int multiply = buckets*freshness;
            bucketsOfIngredientsQueue.poll();
            freshnessLevelStack.pop();
            if(multiply == 150){
                ps++;
            }else if(multiply == 250){
                th++;
            }else if(multiply == 300){
                ah++;
            }else if(multiply == 400){
                hf++;
            }else{
                buckets += 5;
                bucketsOfIngredientsQueue.offer(buckets);
            }
            /*if(ps > 0 && th > 0 && ah > 0 && hf > 0){
                break;
            }*/
        }
        if(ps > 0 && th > 0 && ah > 0 && hf > 0){
            System.out.println("It's party time! The cocktails are ready!");
        }else{
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }
        if(bucketsOfIngredientsQueue.size() > 0){
            int sum = 0;
            for (Integer e : bucketsOfIngredientsQueue) {
                sum += e;
            }
            System.out.printf("Ingredients left: %d%n",sum);
        }
        if(ah > 0){
            System.out.printf(" # Apple Hinny --> %d%n",ah);
        }
        if(hf > 0){
            System.out.printf(" # High Fashion --> %d%n",hf);
        }
        if(ps > 0){
            System.out.printf(" # Pear Sour --> %d%n",ps);
        }
        if(th > 0){
            System.out.printf(" # The Harvest --> %d%n",th);
        }
    }
}
