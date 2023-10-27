package _04_JavaOOP._05_PolymorphismExercise._04_Word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scan.nextLine());
        CommandInterface commandInterface = Initialization.buildCommandInterface(text);

        String inputLine = scan.nextLine();

        while(!inputLine.equals("exit")) {
            commandInterface.handleInput(inputLine);
            inputLine = scan.nextLine();
        }

        System.out.println(text);
        
        scan.close();
    }
}
