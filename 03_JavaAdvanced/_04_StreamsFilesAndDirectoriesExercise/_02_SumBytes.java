package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class _02_SumBytes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // Path
        String pathStr = "...";

        // Read file path
        byte[] allBytes = Files.readAllBytes(Path.of(pathStr));

        long sum = 0;

        // Sum all ASCII character values
        for (byte v : allBytes) {
            if(v != 10 && v != 13) {
                sum += v;
            }
        }

        // Print result
        System.out.println(sum);

        scan.close();
    }
}
