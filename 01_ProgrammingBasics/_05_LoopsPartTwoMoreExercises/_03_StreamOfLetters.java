package _01_ProgrammingBasics._05_LoopsPartTwoMoreExercises;

import java.util.*;

public class _03_StreamOfLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        String input = scan.nextLine();

        // Add variables
        List<String> secret = new ArrayList<>();
        Set<String> special = new HashSet<>();
        StringBuilder hiddenMessage = new StringBuilder();;

        // Solve the secret message
        while (!input.equals("End")) {
            // Check if the input is a letter (A-Z or a-z)
            if (input.matches("[a-zA-Z]")) {
                char letter = input.charAt(0);

                if (special.size() == 3) {
                    // If there are already three special characters, append the hidden message
                    hiddenMessage.append(String.join("", secret)).append(" ");
                    secret.clear();
                    special.clear();
                }

                if (letter == 'c' || letter == 'o' || letter == 'n') {
                    if (special.contains(input)) {
                        secret.add(input);
                    } else {
                        special.add(input);
                    }
                } else {
                    secret.add(input);
                }
            }

            input = scan.nextLine();
        }

        // Append the remaining hidden message if special characters are present
        if (special.size() == 3) {
            hiddenMessage.append(String.join("", secret));
        }

        // Print the hidden message
        System.out.println(hiddenMessage.toString());

        scan.close();
    }
}
