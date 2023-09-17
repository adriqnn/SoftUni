package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        
        // Paths
        Path pathFileOne = Path.of("...");
        Path pathFileTwo = Path.of("...");
        
        // Read file paths
        List<String> allLinesFileOne = Files.readAllLines(pathFileOne);
        List<String> allLinesFileTwo = Files.readAllLines(pathFileTwo);
        
        // Print result
        allLinesFileOne.forEach(System.out::println);
        allLinesFileTwo.forEach(System.out::println);
    }
}
