package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.*;
import java.util.stream.Collectors;

public class SantaSPresentFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> boxesInput = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> magicInput = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        Deque<Integer> boxesStack = new ArrayDeque<>();
        Deque<Integer> magicQueue = new ArrayDeque<>();
        boxesInput.forEach(boxesStack::push);
        magicInput.forEach(magicQueue::offer);
        Map<String,Integer> craftedItems = new TreeMap<>();
        while(!boxesStack.isEmpty() && !magicQueue.isEmpty()){
            int boxNum = boxesStack.peek();
            int magicNum = magicQueue.peek();
            /*while(boxNum == 0 && boxesStack.size() > 1){
                boxesStack.pop();
                boxNum = boxesStack.peek();
            }
            if(boxNum == 0){
                boxesStack.clear();
            }
            while(magicNum == 0 && magicQueue.size() > 1){
                magicQueue.poll();
                magicNum = magicQueue.peek();
            }
            if(magicNum == 0){
                magicQueue.clear();
            }
            if(boxesStack.isEmpty() || magicQueue.isEmpty()){
                break;
            }*/
            if(boxNum == 0 || magicNum == 0 ){
                if(boxNum == 0){
                    boxesStack.pop();
                }
                if(magicNum == 0){
                    magicQueue.poll();
                }
                continue;
            }
            int multiply = boxNum*magicNum;
            boxesStack.pop();
            magicQueue.poll();
            if(multiply > 0){
                if(multiply == 150){
                    craftedItems.putIfAbsent("Doll", 0);
                    craftedItems.put("Doll", craftedItems.get("Doll") + 1);
                }else if(multiply == 250){
                    craftedItems.putIfAbsent("Wooden train", 0);
                    craftedItems.put("Wooden train", craftedItems.get("Wooden train") + 1);
                }else if(multiply == 300){
                    craftedItems.putIfAbsent("Teddy bear", 0);
                    craftedItems.put("Teddy bear", craftedItems.get("Teddy bear") + 1);
                }else if(multiply == 400){
                    craftedItems.putIfAbsent("Bicycle", 0);
                    craftedItems.put("Bicycle", craftedItems.get("Bicycle") + 1);
                }else{
                    int num = boxNum+15;
                    boxesStack.push(num);
                }
            }else if(multiply < 0){
                int num = boxNum+magicNum;
                boxesStack.push(num);
            }
        }
        if((craftedItems.containsKey("Doll") && craftedItems.containsKey("Wooden train")) || (craftedItems.containsKey("Teddy bear") && craftedItems.containsKey("Bicycle"))) {
            System.out.println("The presents are crafted! Merry Christmas!");
        } else {
            System.out.println("No presents this Christmas!");
        }
        if(boxesStack.size() > 0) {
            System.out.print("Materials left: ");
            System.out.print(boxesStack.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.println();
        }
        if (magicQueue.size() > 0){
            System.out.print("Magic left: ");
            System.out.print(magicQueue.stream().map(String::valueOf).collect(Collectors.joining(", ")));
            System.out.println();
        }
        craftedItems.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
