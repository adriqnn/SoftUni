package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String text = scan.nextLine();

        // Add variable
        Map<Character, Integer> countSymbols = new TreeMap<>();

        // Make a statistic of how many characters are used in the input
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            if(countSymbols.containsKey(currentSymbol)){
                int currentCount = countSymbols.get(currentSymbol);
                countSymbols.put(currentSymbol,currentCount+1);
            }else{
                countSymbols.put(currentSymbol,1);
            }
        }

        // Print result
        countSymbols.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " time/s"));

        scan.close();
    }
}
