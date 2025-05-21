package _02_ProgrammingFundamentals._10_TextProcessing._03_MoreExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_TreasureFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int[] key = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String console = scan.nextLine();

        // Add variable
        List<String> treasureInformation = new ArrayList<>();

        // Decrypt information
        while (!console.equals("find")) {
            int n = console.length();

            StringBuilder decrypted = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (key.length - 1 < i) {
                    decrypted.append((char)(console.charAt(i) - key[(i % key.length)]));
                } else {
                    decrypted.append((char)(console.charAt(i) - key[i]));
                }
            }

            treasureInformation.add(decrypted.toString());

            console = scan.nextLine();
        }

        String regexTypeOfTreasure = "&(?<type>[A-Za-z]+)&";
        Pattern patternTypeOfTreasure = Pattern.compile(regexTypeOfTreasure);

        String regexCoordinates = "<(?<coordinates>[A-Za-z0-9]+)>";
        Pattern patternCoordinates = Pattern.compile(regexCoordinates);

        // Find the treasure
        for (int i = 0; i < treasureInformation.size(); i++) {
            Matcher matcherTypeOfTreasure = patternTypeOfTreasure.matcher(treasureInformation.get(i));
            Matcher matcherCoordinates = patternCoordinates.matcher(treasureInformation.get(i));

            String treasure = "";
            String coordinates = "";

            if (matcherTypeOfTreasure.find()) {
                treasure = matcherTypeOfTreasure.group("type");
            }

            if (matcherCoordinates.find()) {
                coordinates = matcherCoordinates.group("coordinates");
            }

            System.out.printf("Found %s at %s%n", treasure, coordinates);
        }

        scan.close();
    }
}
