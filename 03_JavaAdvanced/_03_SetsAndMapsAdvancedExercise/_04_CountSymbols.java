package _03_JavaAdvanced._03_SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_CountSymbols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        Map<Character,Integer> countSymbols = new TreeMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);
            if(countSymbols.containsKey(currentSymbol)){
                int currentCount = countSymbols.get(currentSymbol);
                countSymbols.put(currentSymbol,currentCount+1);
            }else{
                countSymbols.put(currentSymbol,1);
            }
        }
        countSymbols.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue() + " time/s"));
    }
}
