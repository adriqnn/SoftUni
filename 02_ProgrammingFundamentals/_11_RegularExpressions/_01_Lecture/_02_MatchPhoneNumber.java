package _02_ProgrammingFundamentals._11_RegularExpressions._01_Lecture;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String console = scan.nextLine();
        String regexPhone = "\\+359(?<separator>[ -])2\\1\\d{3}\\1\\d{4}\\b";
        Pattern patternPhone = Pattern.compile(regexPhone);
        Matcher matcherPhone = patternPhone.matcher(console);
        List<String> matchedPhones = new ArrayList<>();
        while(matcherPhone.find()){
            matchedPhones.add(matcherPhone.group());
        }
        System.out.println(matchedPhones.toString().replaceAll("[\\[\\]]",""));
    }
}
