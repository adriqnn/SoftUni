package _02_ProgrammingFundamentals._04_Methods._01_Lecture;

import java.util.Scanner;

public class _09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String type = scan.nextLine();

        // Create methods for each possible input and print result
        if (type.equals("int")) {
            int numberOne = Integer.parseInt(scan.nextLine());
            int numberTwo = Integer.parseInt(scan.nextLine());

            System.out.println(whatIsBigger(numberOne, numberTwo));
        } else if (type.equals("char")) {
            char charOne = scan.nextLine().charAt(0);
            char charTwo = scan.nextLine().charAt(0);

            System.out.println(whatIsBigger(charOne, charTwo));
        } else if (type.equals("string")) {
            String firstString = scan.nextLine();
            String secondString = scan.nextLine();

            System.out.println(whatIsBigger(firstString, secondString));
        }

        scan.close();
    }

    private static int whatIsBigger(int numberOne, int numberTwo) {
        return Math.max(numberOne, numberTwo);
    }

    private static char whatIsBigger(char charOne, char charTwo){
        return ((char) (Math.max(charOne, charTwo)));
    }

    private static String whatIsBigger(String firstString, String secondString){
        if (firstString.compareTo(secondString) >= 0) {
            return firstString;
        } else {
            return secondString;
        }
    }
}
