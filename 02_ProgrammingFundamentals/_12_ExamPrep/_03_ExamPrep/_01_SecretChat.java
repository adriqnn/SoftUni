package _02_ProgrammingFundamentals._12_ExamPrep._03_ExamPrep;

import java.util.Scanner;

public class _01_SecretChat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        StringBuilder message = new StringBuilder(scan.nextLine());
        String console = scan.nextLine();

        // Decipher the chat messages
        while (!console.equals("Reveal")) {
            String[] line = console.split(":\\|:");
            String command = line[0];

            switch (command) {
                case "InsertSpace":
                    int indexInsertSpace = Integer.parseInt(line[1]);
                    message.insert(indexInsertSpace, " ");
                    
                    System.out.println(message);
                    break;
                case "Reverse":
                    String sub = line[1];
                    String bus = "";
                    
                    for (int i = sub.length() - 1; i >= 0; i--) {
                        bus += sub.charAt(i);
                    }
                    
                    if (message.toString().contains(sub)) {
                        String newString = message.toString().replace(sub, "");
                        message = new StringBuilder(newString);
                        message.append(bus);
                        
                        System.out.println(message);
                    } else {
                        System.out.println("error");
                    }
                    
                    break;
                case "ChangeAll":
                    String substring = line[1];
                    String replacement = line[2];
                    
                    message = new StringBuilder(message.toString().replaceAll(substring, replacement));
                    System.out.println(message);
                    break;
            }
            
            console = scan.nextLine();
        }
        
        // Print result
        System.out.println("You have a new text message: " + message);
        
        scan.close();
    }
}
