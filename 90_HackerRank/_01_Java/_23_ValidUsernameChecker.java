package _05_HackerRank._01_Java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _23_ValidUsernameChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        String regex = "^[A-Za-z][A-Za-z0-9_]{7,29}$";
        Pattern pattern = Pattern.compile(regex);

        for (int i = 0; i < n; i++) {
            String console = scan.nextLine();
            Matcher matcher = pattern.matcher(console);

            if (matcher.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        scan.close();
    }
}
