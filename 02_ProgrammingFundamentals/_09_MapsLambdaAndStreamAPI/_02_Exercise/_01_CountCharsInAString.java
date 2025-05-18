package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._02_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharsInAString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String text = scan.nextLine();

        // Add variable
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        // Count chars in a string
        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            if (currentSymbol == ' ') {
                continue;
            }

            if (!lettersCount.containsKey(currentSymbol)) {
                lettersCount.put(currentSymbol, 1);
            } else {
                int currentCount = lettersCount.get(currentSymbol);
                currentCount = currentCount + 1;
                lettersCount.put(currentSymbol, currentCount);
            }
        }

        // Print result
        // Can use var instead!
        for (Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // lettersCount.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));

        scan.close();
    }
}
