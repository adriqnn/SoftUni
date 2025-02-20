package _02_ProgrammingFundamentals._03_Arrays._03_MoreExercises;

import java.util.Arrays;
import java.util.Scanner;

public class _05_KaminoFactory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int lengthOfSubsequence = Integer.parseInt(scan.nextLine());
        String console = scan.nextLine();

        // Add variables
        int [] bestDNASample = new int[lengthOfSubsequence];
        int bestIndexDNA = Integer.MAX_VALUE;
        int bestLengthDNA = 0;
        int bestSumDNA = 0;
        int bestPosition = 0;
        int position = 0;

        // Find best clones to make
        while (!console.equals("Clone them!")) {
            position++;

            int[] currentDNA = Arrays.stream(console.split("!+")).mapToInt(Integer::parseInt).toArray();

            int sumOfDNA = 0;
            int bestIndexOfCurrentDNA = 0;
            int indexOfCurrentDNA = 0;
            int lengthOfCurrentDNA = 0;
            int maxLengthOfCurrentDNA = 0;

            for (int i = 0; i < currentDNA.length; i++) {
                if (currentDNA[i] == 1) {
                    sumOfDNA++;

                    if (lengthOfCurrentDNA == 0) {
                        indexOfCurrentDNA = i;
                    }

                    lengthOfCurrentDNA++;
                } else {
                    lengthOfCurrentDNA = 0;
                }

                if (lengthOfCurrentDNA > maxLengthOfCurrentDNA) {
                    maxLengthOfCurrentDNA = lengthOfCurrentDNA;
                    bestIndexOfCurrentDNA = indexOfCurrentDNA;
                }
            }

            if ((maxLengthOfCurrentDNA > bestLengthDNA) || ((maxLengthOfCurrentDNA == bestLengthDNA) && (bestIndexOfCurrentDNA < bestIndexDNA))
                    || ((maxLengthOfCurrentDNA == bestLengthDNA) && (bestIndexOfCurrentDNA == bestIndexDNA) && sumOfDNA > bestSumDNA)) {

                bestLengthDNA = maxLengthOfCurrentDNA;
                bestIndexDNA = bestIndexOfCurrentDNA;
                bestSumDNA = sumOfDNA;
                bestDNASample = currentDNA;
                bestPosition =position;
            }

            console = scan.nextLine();
        }

        // Print result
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestPosition, bestSumDNA);
        Arrays.stream(bestDNASample).forEach(e -> System.out.print(e + " "));

        scan.close();
    }
}
