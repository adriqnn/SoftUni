package _02_ProgrammingFundamentals._02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _10_PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read input values
        int pokemonPowerN = Integer.parseInt(scan.nextLine());
        int distanceM = Integer.parseInt(scan.nextLine());
        int exhaustionFactorY = Integer.parseInt(scan.nextLine());

        // Add variables
        int originalValue = pokemonPowerN / 2;
        int successfulPokes = 0;

        // Check if pokemon can make the move
        while(pokemonPowerN >= distanceM){
            successfulPokes++;
            pokemonPowerN -= distanceM;
            
            if (pokemonPowerN == originalValue && exhaustionFactorY != 0) {
                pokemonPowerN /= exhaustionFactorY;
            }
        }

        // Print result
        System.out.println(pokemonPowerN);
        System.out.println(successfulPokes);

        scan.close();
    }
}
