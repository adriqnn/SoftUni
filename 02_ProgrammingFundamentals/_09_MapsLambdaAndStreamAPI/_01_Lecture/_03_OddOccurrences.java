package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._01_Lecture;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class _03_OddOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        String[] words = scan.nextLine().split(" ");

        // Add variable
        LinkedHashMap<String, Integer> counts = new LinkedHashMap<>();

        // Extract the elements that occur odd times
        for (String word : words) {
            String wordInLowerCase = word.toLowerCase();

            if (counts.containsKey(wordInLowerCase)) {
                counts.put(wordInLowerCase, counts.get(wordInLowerCase) + 1);
            } else {
                counts.put(wordInLowerCase, 1);
            }
        }

        ArrayList<String> odds = new ArrayList<>();

        for (var entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odds.add(entry.getKey());
            }
        }

        // Print result
        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));

            if (i < odds.size() - 1) {
                System.out.print(", ");
            }
        }

        scan.close();
    }
}
