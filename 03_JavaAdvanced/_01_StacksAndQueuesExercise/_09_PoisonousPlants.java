package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _09_PoisonousPlants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int flowers = Integer.parseInt(scan.nextLine());
        List<Long> numbersList = Arrays.stream(scan.nextLine().split("\\s+")).map(Long::parseLong).collect(Collectors.toList());

        // Add variables
        Deque<Integer> indexStack = new ArrayDeque<>();
        boolean noMoreChanges = false;
        int days = 0;

        // Determine the health of the plants
        while (!noMoreChanges){
            if(numbersList.size() > 1){

                for (int i = 1; i < numbersList.size(); i++) {
                    if(numbersList.get(i) > numbersList.get(i-1)){
                        indexStack.push(i);
                    }
                }

            }

            if(indexStack.isEmpty() || numbersList.size() <= 1){
                noMoreChanges = true;
            }else{
                int n = indexStack.size();

                for (int i = 0; i < n; i++) {
                    int index = indexStack.pop();
                    numbersList.remove(index);
                }

                days++;
            }
        }

        System.out.println(days);

        scan.close();
    }
}
