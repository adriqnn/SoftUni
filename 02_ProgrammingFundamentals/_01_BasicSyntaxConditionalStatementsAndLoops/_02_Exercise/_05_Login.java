package _02_ProgrammingFundamentals._01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();

        StringBuilder reverseUsername = new StringBuilder();
        for (int i = username.length()-1; i >= 0; i--) {
            reverseUsername.append(username.charAt(i));
        }
        String console = scan.nextLine();

        int count = 0;
        while (!console.equals(reverseUsername.toString())){
            count++;
            if(count == 4){
                System.out.printf("User %s blocked!%n",username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            console = scan.nextLine();
        }
        System.out.printf("User %s logged in.%n",username);
    }
}
