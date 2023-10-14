package _04_JavaOOP._01_WorkingWithAbstraction._03_StudentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        StudentSystem studentSystem = new StudentSystem();

        while (true) {
            String[] input = scan.nextLine().split("\\s+");

            if(input[0].equals("Exit")){
                break;
            }

            if (input.length == 4) {
                String output = studentSystem.parseCommand(input);
            }else if(input.length == 2 && studentSystem.getStudents().containsKey(input[1])){
                String output = studentSystem.parseCommand(input);

                if (output != null) {
                    System.out.println(output);
                }
            }
        }

        scan.close();
    }
}
