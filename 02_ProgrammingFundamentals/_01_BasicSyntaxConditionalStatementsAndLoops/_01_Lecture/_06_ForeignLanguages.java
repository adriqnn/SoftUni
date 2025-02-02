package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._01_Lecture;

import java.util.Scanner;

public class _06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String country = scan.nextLine();

        // Print country based on the input
        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }

        scan.close();
    }
}
