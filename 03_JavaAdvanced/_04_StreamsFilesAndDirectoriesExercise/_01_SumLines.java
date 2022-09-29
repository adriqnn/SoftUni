package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class _01_SumLines {
    public static void main(String[] args) throws IOException {
        String pathStr = "...";
        Path path = Path.of(pathStr);
        List<String> allLines = Files.readAllLines(path);
        allLines.stream().map(String::toCharArray).forEach(charArray -> {
            int sum = 0;
            for (char symbol : charArray){
                sum += symbol;
            }
            System.out.println(sum);
        });
    }
}
