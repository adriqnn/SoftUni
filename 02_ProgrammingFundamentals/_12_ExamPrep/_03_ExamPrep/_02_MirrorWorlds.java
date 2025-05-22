package _02_ProgrammingFundamentals._12_ExamPrep._03_ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MirrorWorlds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variables
        String regex = "(?<grp1>[@|#])(?<word1>[A-Za-z]{3,})(\\1)(\\1)(?<word2>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(console);
        List<String> mirrors = new ArrayList<>();

        int countPairs = 0;
        int countMirrorWords = 0;
        
        // Find the mirrored words
        while (matcher.find()) {
            countPairs++;
            String first = matcher.group("word1");
            String second = matcher.group("word2");
            
            StringBuilder match = new StringBuilder();
            for (int i = second.length() - 1; i >= 0; i--) {
                match.append(second.charAt(i));
            }
            
            if (match.toString().equals(first)) {
                countMirrorWords++;
                mirrors.add(first + " <=> " + second);
            }
        }
        
        // Print result
        if (countPairs == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n", countPairs);
            
            if (countMirrorWords == 0) {
                System.out.println("No mirror words!");
            } else {
                System.out.println("The mirror words are:");
                System.out.println(mirrors.toString().replace("[", "").replace("]", ""));
            }
        }
        
        scan.close();
    }
}
