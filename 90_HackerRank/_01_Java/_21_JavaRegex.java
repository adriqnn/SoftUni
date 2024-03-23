package _05_HackerRank._01_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _21_JavaRegex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String regex = "^([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])$";
        Pattern pattern = Pattern.compile(regex);

        while (scan.hasNext()){
            String console = scan.next();
            Matcher matcher = pattern.matcher(console);

            System.out.println(matcher.find());
        }

        scan.close();
    }
}
