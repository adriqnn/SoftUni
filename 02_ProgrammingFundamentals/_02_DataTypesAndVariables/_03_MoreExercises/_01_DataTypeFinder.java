package _02_ProgrammingFundamentals._02_DataTypesAndVariables._03_MoreExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String console = scan.nextLine();

        String regexInteger = "^-?[0-9]+$";
        Pattern patternInteger = Pattern.compile(regexInteger);
        String regexFloat = "^-?[0-9]+\\.[0-9]+$";
        Pattern patternFloat = Pattern.compile(regexFloat);

        while(!console.equals("END")){
            Matcher matcherInteger = patternInteger.matcher(console);
            Matcher matcherFloat = patternFloat.matcher(console);
            if(console.equalsIgnoreCase("true") || console.equalsIgnoreCase("false")){
                System.out.printf("%s is boolean type%n", console);
            }else if (console.length() == 1 && (console.charAt(0) <= 47 || console.charAt(0) >= 58)){
                System.out.printf("%s is character type%n",console);
            }else if (matcherFloat.find()){
                System.out.printf("%s is floating point type%n",console);
            }else if (matcherInteger.find()){
                System.out.printf("%s is integer type%n",console);
            }else{
                System.out.printf("%s is string type%n",console);
            }
            console = scan.nextLine();
        }
    }
}
