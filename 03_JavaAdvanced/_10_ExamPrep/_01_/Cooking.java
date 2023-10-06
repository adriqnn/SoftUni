package _03_JavaAdvanced._10_ExamPrep._01_;

import java.util.*;

public class Cooking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Deque<Integer> liquidsQueue = new ArrayDeque<>();
        Deque<Integer> ingredientsStack = new ArrayDeque<>();

        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(liquidsQueue::offer);
        Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).forEach(ingredientsStack::push);

        Map<String, Integer> food = new LinkedHashMap<>();
        food.put("Bread", 0);
        food.put("Cake", 0);
        food.put("Fruit Pie", 0);
        food.put("Pastry", 0);
        
        while(!liquidsQueue.isEmpty() && !ingredientsStack.isEmpty()){
            int l = liquidsQueue.poll();
            int i = ingredientsStack.pop();
            
            int sum = i + l;
            
            if(sum == 25){
                food.put("Bread", food.get("Bread") + 1);
            }else if(sum == 50){
                food.put("Cake", food.get("Cake") + 1);
            }else if(sum == 75){
                food.put("Pastry", food.get("Pastry") + 1);
            }else if(sum == 100){
                food.put("Fruit Pie", food.get("Fruit Pie") + 1);
            }else{
                i += 3;
                ingredientsStack.push(i);
            }
        }
        
        if(food.get("Bread") != 0 && food.get("Cake") != 0 && food.get("Pastry") != 0 && food.get("Fruit Pie") != 0){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        }else{
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }
        
        if (liquidsQueue.isEmpty()){
            System.out.println("Liquids left: none");
        }else {
            System.out.println("Liquids left: " + liquidsQueue.toString().replaceAll("[\\[\\]]", ""));
        }
        
        if (ingredientsStack.isEmpty()){
            System.out.println("Ingredients left: none");
        }else {
            System.out.println("Ingredients left: " + ingredientsStack.toString().replaceAll("[\\[\\]]", ""));
        }
        
        System.out.printf("Bread: %d%n", food.get("Bread"));
        System.out.printf("Cake: %d%n", food.get("Cake"));
        System.out.printf("Fruit Pie: %d%n", food.get("Fruit Pie"));
        System.out.printf("Pastry: %d%n", food.get("Pastry"));
        
        scan.close();
    }
}
