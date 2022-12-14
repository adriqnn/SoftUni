package _02_ProgrammingFundamentals._06_ObjectsAndClasses._01_Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> words = Arrays.stream(scan.nextLine().split("\\s+")).collect(Collectors.toList());
        Random rnd = new Random();
        while(words.size() > 0){
            String word = words.remove(rnd.nextInt(words.size()));
            System.out.println(word);
        }
    }
}
