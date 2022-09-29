package _02_ProgrammingFundamentals._11_RegularExpressions._01_Lecture;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_MatchFullName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String regexName = "(?<name>\\b[A-Z][a-z]+ [A-Z][a-z]+\\b)";
        Pattern patternName = Pattern.compile(regexName);
        String console = scan.nextLine();
        Matcher matcherName = patternName.matcher(console);
        while(matcherName.find()){
            String find = matcherName.group("name");
            System.out.print(find + " ");
        }
    }
}
