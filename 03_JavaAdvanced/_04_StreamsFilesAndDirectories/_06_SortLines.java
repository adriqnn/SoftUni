package _03_JavaAdvanced._04_StreamsFilesAndDirectories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_SortLines {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Path path = Paths.get("...");
        try{
            List<String> lines = Files.readAllLines(path);
            lines = lines.stream().filter(l -> !l.isBlank()).collect(Collectors.toList());
            Collections.sort(lines);
            lines.forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
        scan.close();
    }
}
