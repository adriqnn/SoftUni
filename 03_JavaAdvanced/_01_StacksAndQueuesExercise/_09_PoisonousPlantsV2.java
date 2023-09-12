package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class _09_PoisonousPlantsV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read input values
        int n = Integer.parseInt(reader.readLine());
        String[] tokens = reader.readLine().split(" ");

        // Add variable
        int[] plants = new int[n];
        Deque<Integer> indexes = new ArrayDeque<>(List.of(0));

        for (int i = 0; i < n; i++) {
            plants[i] = Integer.parseInt(tokens[i]);
        }

        int[] days = new int[n];
        for (int i = 0; i < n; i++) {
            int maxDays = 0;
            
            while(!indexes.isEmpty() && plants[indexes.peek()] >= plants[i]){
                maxDays = Math.max(maxDays, days[indexes.pop()]);
            }
            
            if(!indexes.isEmpty()){
                days[i] = maxDays + 1;
            }
            
            indexes.push(i);
        }
        
        // Print result
        System.out.println(getLast(days));
        
        reader.close();
    }
    
    // Method that determines the  last day
    private static int getLast(int[] days){
        int lastDay = 0;
        
        for (int day : days) {
            if(day > lastDay) {
                lastDay = day;
            }
        }
        
        return lastDay;
    }
}
