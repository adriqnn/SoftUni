package _02_ProgrammingFundamentals._11_RegularExpressions._01_Lecture;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read input value
        String console = scan.nextLine();
        
        // Add variables
        String regexName = "(?<name>\\b[A-Z][a-z]+ [A-Z][a-z]+\\b)";
        Pattern patternName = Pattern.compile(regexName);
        Matcher matcherName = patternName.matcher(console);
        
        // Match the name and print result
        while (matcherName.find()) {
            String find = matcherName.group("name");
            
            System.out.print(find + " ");
        }
        
        scan.close();
    }
}
