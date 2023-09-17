package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class _03_ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        
        // Path
        String pathStr = "...";
        
        // Read file path
        Files.readAllLines(Path.of(pathStr)).forEach(e -> System.out.println(e.toUpperCase()));
        //BufferedWriter writer = new BufferedWriter(new FileWriter(name));
        
        // Print result
        //writer.write(name) with try/catch and e.printStackTrace;
        //writer.newLine();
        //writer.close();
        
        scan.close();
    }
}
