package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class _05_LineNumbers {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String pathStr = "...";
        List<String> allLines = Files.readAllLines(Path.of(pathStr));
        //PrintWriter writer = new PrintWriter(name);
        int count = 1;
        for (String e : allLines) {
            System.out.println(count++ + ". " + e);
        }
        //writer.close();
        scan.close();
    }
}
