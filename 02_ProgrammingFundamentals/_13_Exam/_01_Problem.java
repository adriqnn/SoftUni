package _02_ProgrammingFundamentals._13_Exam;

import java.util.Scanner;

public class _01_Problem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        StringBuilder username = new StringBuilder(scan.nextLine());
        String console = scan.nextLine();

        // String operations
        while (!console.equals("Sign up")) {
            String[] commandLine = console.split(" ");
            
            String command = commandLine[0];
            
            switch (command) {
                case "Case":
                    String caseUpperOrLower = commandLine[1];
                    
                    if (caseUpperOrLower.equals("lower")) {
                        String toLower = username.toString().toLowerCase();
                        username = new StringBuilder(toLower);
                        
                        System.out.println(username);
                    } else if (caseUpperOrLower.equals("upper")) {
                        String toUpper = username.toString().toUpperCase();
                        username = new StringBuilder(toUpper);
                        
                        System.out.println(username);
                    }
                    break;
                case "Reverse":
                    int intReverseStart = Integer.parseInt(commandLine[1]);
                    int intReverseEnd = Integer.parseInt(commandLine[2]);
                    
                    if ((intReverseStart >= 0 && intReverseStart < username.length()) && (intReverseEnd >=0 && intReverseEnd < username.length())) {
                        String toReverse = "";
                        
                        for (int i = intReverseStart; i <= intReverseEnd; i++) {
                            toReverse += username.charAt(i);
                        }
                        
                        String reversed = "";
                        
                        for (int i = toReverse.length() - 1; i >= 0; i--) {
                            reversed += toReverse.charAt(i);
                        }
                        
                        System.out.println(reversed);
                    }
                    
                    break;
                case "Cut":
                    String stringToCut = commandLine[1];
                    
                    if (username.toString().contains(stringToCut)) {
                        String cutString = username.toString().replaceFirst(stringToCut, "");
                        username = new StringBuilder(cutString);
                        
                        System.out.println(username);
                    } else {
                        System.out.printf("The word %s doesn't contain %s.%n", username, stringToCut);
                    }
                    
                    break;
                case "Replace":
                    String charToReplace = commandLine[1];
                    
                    String afterReplacedChars = username.toString().replace(charToReplace, "*");
                    username = new StringBuilder(afterReplacedChars);
                    
                    System.out.println(username);
                    
                    break;
                case "Check":
                    String charToContain = commandLine[1];
                    
                    if (username.toString().contains(charToContain)) {
                        System.out.println("Valid");
                    } else {
                        System.out.printf("Your username must contain %s.%n", charToContain);
                    }
                    
                    break;
            }
            
            console = scan.nextLine();
        }
        
        scan.close();
    }
}
