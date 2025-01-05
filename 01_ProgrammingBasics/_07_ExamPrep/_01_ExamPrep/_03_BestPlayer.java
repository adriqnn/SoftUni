package _01_ProgrammingBasics._08_ExamPrep;

import java.util.Scanner;

public class _03_BestPlayer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String console = scan.nextLine();

        // Add variables
        String bestPlayer = "";
        int max = Integer.MIN_VALUE;

        // Find the best player
        while (!console.equals("END")) {
            int score = Integer.parseInt(scan.nextLine());
            
            if (score > max) {
                max = score;
                bestPlayer = console;
                
                if (score >= 10) {
                    break;
                }
            }
            
            console = scan.nextLine();
        }

        // Print result
        if (max >= 10) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        } else if (max >= 3) {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals and made a hat-trick !!!", max);
        } else {
            System.out.printf("%s is the best player!%n", bestPlayer);
            System.out.printf("He has scored %d goals.", max);
        }

        scan.close();
    }
}
