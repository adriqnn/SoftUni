package _02_ProgrammingFundamentals._13_Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        int n = Integer.parseInt(scan.nextLine());
        
        // Add variables
        String regex = "(?<grp1>.+)>(?<grp2>[0-9]{3})\\|(?<grp3>[a-z]{3})\\|(?<grp4>[A-Z]{3})\\|(?<grp5>[^><]{3})<(\\1)";
        Pattern pattern = Pattern.compile(regex);

        // Match passwords
        for (int i = 0; i < n; i++) {
            String console = scan.nextLine();
            Matcher matcher = pattern.matcher(console);

            // Print result
            if (matcher.find()) {
                String one = matcher.group("grp2");
                String two = matcher.group("grp3");
                String three = matcher.group("grp4");
                String four = matcher.group("grp5");
                
                StringBuilder password = new StringBuilder();
                System.out.println("Password: " + one + two + three + four);
            } else {
                System.out.println("Try another password!");
            }
        }
        
        scan.close();
    }
}
