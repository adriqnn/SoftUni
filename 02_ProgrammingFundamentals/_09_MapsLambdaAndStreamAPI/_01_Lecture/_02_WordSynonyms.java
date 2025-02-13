package _02_ProgrammingFundamentals._09_MapsLambdaAndStreamAPI._01_Lecture;

import java.util.*;

public class _02_WordSynonyms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int countOfWords = Integer.parseInt(scan.nextLine());

        // Add variable
        Map<String, List<String>> synonymDictionary = new LinkedHashMap<>();

        // Build dictionary with synonyms
        for (int i = 0; i < countOfWords; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!synonymDictionary.containsKey(word)) {
                List<String> synonymForCurrentWord = new ArrayList<>();

                synonymForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymForCurrentWord);
            } else {
                List<String> synonymsForCurrentWord = synonymDictionary.get(word);

                synonymsForCurrentWord.add(synonym);
                synonymDictionary.put(word, synonymsForCurrentWord);
            }
        }

        // Print result
        for (Map.Entry<String, List<String>> wordEntry : synonymDictionary.entrySet()) {
            String currentWord = wordEntry.getKey();
            List<String> synonymsForCurrentWord = wordEntry.getValue();

            System.out.printf("%s - %s%n", currentWord, String.join(", ", synonymsForCurrentWord));
        }

        scan.close();
    }
}
