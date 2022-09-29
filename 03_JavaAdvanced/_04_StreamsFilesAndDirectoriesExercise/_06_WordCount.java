package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class _06_WordCount {
    public static void main(String[] args) throws IOException {
        Path pathToWords = Path.of("...");
        LinkedHashMap<String,Integer> wordsCount = new LinkedHashMap<>();
        List<String> allLinesWords = Files.readAllLines(pathToWords);
        allLinesWords.forEach(e -> Arrays.stream(e.split("\\s+")).forEach(word -> wordsCount.put(word,0)));
        Path pathText = Path.of("...");
        List<String> textAllLines = Files.readAllLines(pathText);
        for (String e : textAllLines) {
            String[] wordInLine = e.split("\\s+");
            Arrays.stream(wordInLine).forEach(word -> {
                if(wordsCount.containsKey(word)){
                    int currentCount = wordsCount.get(word);
                    wordsCount.put(word,currentCount + 1);
                }
            });
        }
        wordsCount.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
