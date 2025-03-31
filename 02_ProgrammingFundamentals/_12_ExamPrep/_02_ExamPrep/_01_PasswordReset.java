package _02_ProgrammingFundamentals._12_ExamPrep._02_ExamPrep;

import java.util.Scanner;

public class _01_PasswordReset {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        StringBuilder console = new StringBuilder(scan.nextLine());
        String command = scan.nextLine();

        // Reset password
        while (!command.equals("Done")){
            String[] commandCollection = command.split(" ");
            String commandLine = commandCollection[0];

            switch (commandLine){
                case "TakeOdd":
                    StringBuilder concatenate = new StringBuilder();

                    for (int i = 0; i < console.length(); i++) {
                        if(i % 2 != 0){
                            concatenate.append(console.charAt(i));
                        }
                    }

                    System.out.println(concatenate);
                    console = concatenate;
                    break;
                case "Cut":
                    int index = Integer.parseInt(commandCollection[1]);
                    int length = Integer.parseInt(commandCollection[2]);

                    //String substringToRemove = password.substring(index, index+length);
                    //password = password.replaceFirst(substringToRemove, "");

                    console.replace(index, index + length, "");
                    System.out.println(console);
                    break;
                case "Substitute":
                    String exist = commandCollection[1];
                    String replace = commandCollection[2];
                    String consoleToString = console.toString();

                    if (consoleToString.contains(exist)) {
                        consoleToString = consoleToString.replaceAll(exist, replace);
                        console = new StringBuilder(consoleToString);
                        System.out.println(console);

                    } else {
                        console = new StringBuilder(consoleToString);
                        System.out.println("Nothing to replace!");
                    }

                    break;
            }

            command = scan.nextLine();
        }

        // Print result 
        System.out.printf("Your password is: %s", console);

        scan.close();
    }
}

