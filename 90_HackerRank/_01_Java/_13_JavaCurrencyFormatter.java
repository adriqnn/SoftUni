package _05_HackerRank._01_Java;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class _13_JavaCurrencyFormatter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double value = Double.parseDouble(scan.nextLine());
        Locale newIndiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("US: %s%n", us.format(value));
        NumberFormat in = NumberFormat.getCurrencyInstance(newIndiaLocale);
        System.out.printf("India: %s%n", in.format(value));
        NumberFormat cn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.printf("China: %s%n", cn.format(value));
        NumberFormat fr = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.printf("France: %s%n", fr.format(value));

        scan.close();
    }
}
