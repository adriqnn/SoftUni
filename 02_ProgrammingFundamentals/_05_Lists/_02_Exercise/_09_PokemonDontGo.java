package _02_ProgrammingFundamentals._05_Lists._02_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_PokemonDontGo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        List<Integer> pokemonDistance = Arrays.stream(scan.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        // Add variable
        int sum = 0;

        // Read and execute commands based on the input
        while (!pokemonDistance.isEmpty()) {
            int element = Integer.parseInt(scan.nextLine());

            if (element >= 0 && element < pokemonDistance.size()) {
                int removedElement = pokemonDistance.get(element);
                pokemonDistance.remove(element);
                sum += removedElement;

                for (int i = 0; i < pokemonDistance.size(); i++) {
                    if (pokemonDistance.get(i) <= removedElement) {
                        pokemonDistance.set(i, pokemonDistance.get(i) + removedElement);
                    } else {
                        pokemonDistance.set(i, pokemonDistance.get(i) - removedElement);
                    }
                }
            } else if (element < 0) {
                int removedElement = pokemonDistance.get(0);
                pokemonDistance.set(0, pokemonDistance.get(pokemonDistance.size() - 1));
                sum += removedElement;

                for (int i = 0; i < pokemonDistance.size(); i++) {
                    if (pokemonDistance.get(i) <= removedElement) {
                        pokemonDistance.set(i, pokemonDistance.get(i) + removedElement);
                    } else {
                        pokemonDistance.set(i, pokemonDistance.get(i) - removedElement);
                    }
                }
            } else if (element > pokemonDistance.size() - 1) {
                int removedElement = pokemonDistance.get(pokemonDistance.size() - 1);
                pokemonDistance.set(pokemonDistance.size() - 1, pokemonDistance.get(0));
                sum += removedElement;

                for (int i = 0; i < pokemonDistance.size(); i++) {
                    if (pokemonDistance.get(i) <= removedElement) {
                        pokemonDistance.set(i, pokemonDistance.get(i) + removedElement);
                    } else {
                        pokemonDistance.set(i, pokemonDistance.get(i) - removedElement);
                    }
                }
            }
        }

        // Print result
        System.out.println(sum);

        scan.close();
    }
}
