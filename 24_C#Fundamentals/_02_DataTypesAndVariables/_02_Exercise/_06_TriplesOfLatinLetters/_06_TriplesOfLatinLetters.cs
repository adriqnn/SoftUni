using System;

public class _06_TriplesOfLatinLetters
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Print latin letters
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    char first = (char)('a' + i);
                    char second = (char)('a' + j);
                    char third = (char)('a' + k);

                    Console.WriteLine($"{first}{second}{third}");
                }
            }
        }
    }
}
