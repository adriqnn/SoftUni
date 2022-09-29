package _03_JavaAdvanced._01_StacksAndQueuesExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class _09_PoisonousPlantsV2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] tokens = reader.readLine().split(" ");
        int[] plants = new int[n];
        for (int i = 0; i < n; i++) {
            plants[i] = Integer.parseInt(tokens[i]);
        }
        Deque<Integer> indexes = new ArrayDeque<>();
        indexes.push(0);
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
        System.out.println(getLast(days));
    }
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
