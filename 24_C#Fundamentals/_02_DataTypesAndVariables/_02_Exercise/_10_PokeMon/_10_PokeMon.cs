using System;

public class _10_PokeMon
{
    public static void Main(string[] args)
    {
        // Read input values
        int pokemonPowerN = int.Parse(Console.ReadLine());
        int distanceM = int.Parse(Console.ReadLine());
        int exhaustionFactorY = int.Parse(Console.ReadLine());

        // Add variables
        int originalValue = pokemonPowerN / 2;
        int successfulPokes = 0;

        // Check if pokemon can make the move
        while (pokemonPowerN >= distanceM)
        {
            successfulPokes++;
            pokemonPowerN -= distanceM;

            if (pokemonPowerN == originalValue && exhaustionFactorY != 0)
            {
                pokemonPowerN /= exhaustionFactorY;
            }
        }

        // Print result
        Console.WriteLine(pokemonPowerN);
        Console.WriteLine(successfulPokes);
    }
}
