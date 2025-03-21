package _02_ProgrammingFundamentals._11_RegularExpressions._01_Lecture;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_MatchDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String dates = scan.nextLine();

        // Add variables
        String regex = "\\b(?<day>\\d{2})(?<separator>[\\/\\-.])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dates);

        // Match dates and print result
        while (matcher.find()) {
            String day = matcher.group("day");
            String month = matcher.group("month");
            String year = matcher.group("year");
            
            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
        
        scan.close();
    }
}
