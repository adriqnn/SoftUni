package _05_HackerRank._01_Java;

import java.util.Scanner;

public class _34_JavaStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            String input = scan.next();
            while(input.contains("{}") || input.contains("()") || input.contains("[]")){
                input = input.replace("()", "");
                input = input.replace("{}", "");
                input = input.replace("[]", "");
            }
            
            System.out.println(input.length() == 0 ? "true" : "false");
        }

        scan.close();
    }
}
