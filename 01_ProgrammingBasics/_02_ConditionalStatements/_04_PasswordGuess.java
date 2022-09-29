package _01_ProgrammingBasics._02_ConditionalStatements;

import java.util.Scanner;

public class _04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "s3cr3t!P@ssw0rd";
        String passwordInput = scan.nextLine();

        if(passwordInput.equals(password)) {
            System.out.println("Welcome");
        }else{
            System.out.println("Wrong password!");}
    }
}
