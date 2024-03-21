package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _09_JavaEndOfFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = 1;
        while(scan.hasNext()){
            String line = scan.nextLine();
            System.out.println(n + " " + line);

            n++;
        }

        scan.close();
    }
}
