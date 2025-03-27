package _02_ProgrammingFundamentals._11_RegularExpressions._03_MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_SantaSSecretHelper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int subtractNumber = Integer.parseInt(scan.nextLine());
        String input = scan.nextLine();

        // Read the message and decipher
        while (!input.equals("end")) {

            StringBuilder message = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                message.append((char) (input.charAt(i) - subtractNumber));
            }

            String decodeRegex = "@(?<name>[A-Za-z]+)[^@\\-!:>]+(!)(?<grade>[GN]{1})(\\2)";
            Pattern decodePattern = Pattern.compile(decodeRegex);
            Matcher decodeMatcher = decodePattern.matcher(message);

            while(decodeMatcher.find()){
                if(decodeMatcher.group("grade").equals("G")){
                    System.out.println(decodeMatcher.group("name"));
                }
            }
            
            input = scan.nextLine();
        }
        
        scan.close();
    }
}
