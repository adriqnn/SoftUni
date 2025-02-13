package _02_ProgrammingFundamentals._07_MidExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class _03_TheLift {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int people = Integer.parseInt(scan.nextLine());
        int[] state = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        // Determine the state of the lift
        for (int i = 0; i < state.length; i++) {
            if (state[i] < 4) {
                int n1 = 4 - state[i]; // free spots

                if (people >= n1) {
                    state[i] = state[i] + n1;
                    people -= n1;
                } else {
                    state[i] = state[i] + people;
                    people -= people;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < state.length; i++) {
            if (state[i] < 4) {
                int n = 4 - state[i];
                count += n;
            }

        }

        // Print result
        if (count > 0 && people == 0) {
            System.out.println("The lift has empty spots!");

            for (int i : state) {
                System.out.print(i + " ");
            }
        } else if (count == 0 && people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);

            for (int i : state) {
                System.out.print(i + " ");
            }
        } else if (count == 0 && people == 0) {
            for (int i : state) {
                System.out.print(i + " ");
            }
        }

        scan.close();
    }
}
