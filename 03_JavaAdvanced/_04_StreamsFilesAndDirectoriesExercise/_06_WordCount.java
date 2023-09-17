package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class _06_WordCount {
    public static void main(String[] args) throws IOException {

        // Paths
        Path pathToWords = Path.of("...");
        Path pathText = Path.of("...");

        // Read file paths
        List<String> allLinesWords = Files.readAllLines(pathToWords);
        List<String> textAllLines = Files.readAllLines(pathText);

        LinkedHashMap<String, Integer> wordsCount = new LinkedHashMap<>();
        allLinesWords.forEach(e -> Arrays.stream(e.split("\\s+")).forEach(word -> wordsCount.put(word, 0)));
        
        // Count how many times the given words are contained in the text file
        for (String e : textAllLines) {
            String[] wordInLine = e.split("\\s+");
            
            Arrays.stream(wordInLine).forEach(word -> {
                if(wordsCount.containsKey(word)){
                    int currentCount = wordsCount.get(word);
                    wordsCount.put(word, currentCount + 1);
                }
            });
        }
        
        // Print result
        wordsCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
