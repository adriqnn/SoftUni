using System;
using System.Xml.Linq;

public class _09_PokemonDontGo
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> pokemonDistance = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

        // Add variable
        int sum = 0;

        // Read and execute commands based on the input
        while (pokemonDistance.Count > 0)
        {
            int element = int.Parse(Console.ReadLine());

            if (element >= 0 && element < pokemonDistance.Count)
            {
                int removedElement = pokemonDistance[element];
                pokemonDistance.RemoveAt(element);
                sum += removedElement;

                for (int i = 0; i < pokemonDistance.Count; i++)
                {
                    if (pokemonDistance[i] <= removedElement)
                    {
                        pokemonDistance[i] = pokemonDistance[i] + removedElement;
                    }
                    else
                    {
                        pokemonDistance[i] = pokemonDistance[i] - removedElement;
                    }
                }
            }
            else if (element < 0)
            {
                int removedElement = pokemonDistance[0];
                pokemonDistance[0] = pokemonDistance[pokemonDistance.Count - 1];
                sum += removedElement;

                for (int i = 0; i < pokemonDistance.Count; i++)
                {
                    if (pokemonDistance[i] <= removedElement)
                    {
                        pokemonDistance[i] = pokemonDistance[i] + removedElement;
                    }
                    else
                    {
                        pokemonDistance[i] = pokemonDistance[i] - removedElement;
                    }
                }
            }
            else if (element > pokemonDistance.Count - 1)
            {
                int removedElement = pokemonDistance[pokemonDistance.Count - 1];
                pokemonDistance[pokemonDistance.Count - 1] = pokemonDistance[0];
                sum += removedElement;

                for (int i = 0; i < pokemonDistance.Count; i++)
                {
                    if (pokemonDistance[i] <= removedElement)
                    {
                        pokemonDistance[i] = pokemonDistance[i] + removedElement;
                    }
                    else
                    {
                        pokemonDistance[i] = pokemonDistance[i] - removedElement;
                    }
                }
            }
        }

        // Print result
        Console.WriteLine(sum);
    }
}
