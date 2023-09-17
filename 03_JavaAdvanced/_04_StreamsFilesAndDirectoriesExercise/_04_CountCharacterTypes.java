package _03_JavaAdvanced._04_StreamsFilesAndDirectoriesExercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class _04_CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        // Path
        String pathStr = "...";

        // Read file path
        List<String> allLines = Files.readAllLines(Path.of(pathStr));

        // Add variables
        int countVowels = 0;
        int countConsonants = 0;
        int countPunctuations = 0;

        // Count vowels, consonants and punctuation in the file
        for (String e : allLines) {
            for (int i = 0; i < e.length(); i++) {
                char currentSymbol = e.charAt(i);
                
                if (currentSymbol == 'a' || currentSymbol == 'e' || currentSymbol == 'i' || currentSymbol == 'o' || currentSymbol == 'u'){
                    countVowels++;
                }else if (currentSymbol == '!' || currentSymbol == ',' || currentSymbol == '.' || currentSymbol == '?'){
                    countPunctuations++;
                }else if (currentSymbol == ' '){
                    continue;
                }else{
                    countConsonants++;
                }
            }
        }
        
        // Print result
        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);
        System.out.println("Punctuation: " + countPunctuations);
        
        scan.close();
    }
}
