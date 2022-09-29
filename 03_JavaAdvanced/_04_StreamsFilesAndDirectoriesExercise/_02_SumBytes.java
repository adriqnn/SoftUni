package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class _02_SumBytes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String pathStr = "...";
        byte[] allBytes = Files.readAllBytes(Path.of(pathStr));
        long sum = 0;
        for (byte v : allBytes) {
            if(v != 10 && v != 13) {
                sum += v;
            }
        }
        System.out.println(sum);
        scan.close();
    }
}
