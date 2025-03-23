package _02_ProgrammingFundamentals._11_RegularExpressions._02_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        String regex = "\\%(?<customer>[A-Z][a-z]+)\\%[^|%.$]*<(?<product>\\w+)>[^|%.$]*\\|(?<count>[0-9]+)\\|[^|%.$\\d]*(?<price>[0-9]+\\.?[0-9][0-9]?)\\$";
        Pattern pattern = Pattern.compile(regex);
        double total = 0;

        // Calculate the income of a bar
        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String customer = matcher.group("customer");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));

                total += count * price;

                System.out.printf("%s: %s - %.2f%n", customer, product, count * price);
            }

            input = scan.nextLine();
        }

        // Print result
        System.out.printf("Total income: %.2f", total);

        scan.close();
    }
}
