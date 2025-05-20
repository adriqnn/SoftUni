package _02_ProgrammingFundamentals._10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _07_String {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input value
        StringBuilder console = new StringBuilder(scan.nextLine());

        // Add variables
        int leftover = 0;
        boolean has = false;

        // Remove appropriate characters based on the task
        for (int i = 0; i < console.length(); i++) {
            int index = 0;
            int remove = 0;

            if (console.charAt(i) == '>') {
                if (has) {
                    index = Character.getNumericValue(console.charAt(i + 1)) + leftover;
                    remove = Character.getNumericValue(console.charAt(i + 1)) + leftover;

                    has = false;
                } else {
                    index = Character.getNumericValue(console.charAt(i + 1));
                    remove = Character.getNumericValue(console.charAt(i + 1));
                }

                if (i + index >= console.length() - 1 && !console.substring(i + 1, console.length() - 1).contains(">")) {
                    console.delete(i + 1, i + 1 + index);
                    continue;
                } else if (i + index >= console.length() - 1) {
                    for (int j = i + 1; j < i + index + 1; j++) {
                        if (console.charAt(j) != '>') {
                            console.deleteCharAt(j);
                            remove--;
                            j--;
                        } else {
                            leftover = remove;
                            has = true;
                            break;
                        }
                    }

                    continue;
                }

                if (!console.substring(i + 1, i + index + 1).contains(">")) {
                    console.delete(i + 1, i + 1 + index);
                } else {
                    for (int j = i + 1; j < i + index + 1; j++) {
                        if (console.charAt(j) != '>') {
                            console.deleteCharAt(j);
                            remove--;
                            j--;
                        } else {
                            leftover = remove;
                            has = true;
                            break;
                        }
                    }
                }
            }
        }

        // Print result
        System.out.println(console);

        scan.close();
    }
}
