package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _07_MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path pathFileOne = Path.of("...");
        List<String> allLinesFileOne = Files.readAllLines(pathFileOne);
        Path pathFileTwo = Path.of("...");
        List<String> allLinesFileTwo = Files.readAllLines(pathFileTwo);
        allLinesFileOne.forEach(System.out::println);
        allLinesFileTwo.forEach(System.out::println);
    }
}
