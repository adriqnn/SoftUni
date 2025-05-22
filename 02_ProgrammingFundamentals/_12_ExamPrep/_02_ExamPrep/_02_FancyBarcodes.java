package _02_ProgrammingFundamentals._12_ExamPrep._02_ExamPrep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_FancyBarcodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());

        // Add variables
        String regexBarcodes = "@#+(?<group2>[A-Z][A-Za-z0-9]{4,}[A-Z])@#+";
        Pattern patternBarcodes = Pattern.compile(regexBarcodes);

        // Read barcodes and print result
        for (int i = 1; i <= n; i++) {
            String console = scan.next();
            Matcher matcherBarcodes = patternBarcodes.matcher(console);
            
            if (matcherBarcodes.find()) {
                String barcode = matcherBarcodes.group("group2");
                StringBuilder group = new StringBuilder();
                
                for (int j = 0; j < barcode.length(); j++) {
                    char symbol = barcode.charAt(j);
                    
                    if (Character.isDigit(symbol)) {
                        group.append(symbol);
                    }
                }
                
                if (group.toString().equals("")) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.printf("Product group: %s%n", group);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }

        scan.close();
    }
}
