package _02_ProgrammingFundamentals._12_ExamPrep._01_ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_DestinationMapper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variables
        String regex = "(?<equals>[=\\/])(?<destination>[A-Z][A-Za-z]{2,})(\\1)";
        Pattern regexPattern = Pattern.compile(regex);
        Matcher regexMatcher = regexPattern.matcher(console);

        List<String> locations = new ArrayList<>();
        int sum = 0;
        
        // int travelPoints = locations.stream().mapToInt(location -> location.length()).sum();
        // int travelPoints = locations.stream().mapToInt(String::length).sum();
        // String resultText = String.join(", ", locations);

        // Determine destination
        while (regexMatcher.find()) {
            locations.add(regexMatcher.group("destination"));
            
            for (int i = 0; i < regexMatcher.group("destination").length(); i++) {
                sum++;
            }
        }

        // Print result
        System.out.print("Destinations: ");
        // locations.stream().forEach(e -> System.out.print(e));
        System.out.println(locations.toString().replace("[", "").replace("]",  ""));
        System.out.println("Travel Points: " + sum);

        scan.close();
    }
}
