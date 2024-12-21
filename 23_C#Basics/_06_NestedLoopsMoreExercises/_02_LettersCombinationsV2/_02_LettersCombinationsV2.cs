using System;

public class _02_LettersCombinationsV2
{
    public static void Main(string[] args)
    {
        // Read input values
        char first = Console.ReadLine()[0];
        char second = Console.ReadLine()[0];
        char skipLetter = Console.ReadLine()[0];

        // Add variable
        int count = 0;

        // Find all the combinations and print them
        for (char i = first; i <= second; i++)
        {
            for (char j = first; j <= second; j++)
            {
                for (char k = first; k <= second; k++)
                {
                    if (i != skipLetter && j != skipLetter && k != skipLetter)
                    {
                        count++;
                        Console.Write($"{i}{j}{k} ", i, j, k);
                    }
                }
            }
        }

        // Print the count of the combinations
        Console.WriteLine(count);
    }
}
