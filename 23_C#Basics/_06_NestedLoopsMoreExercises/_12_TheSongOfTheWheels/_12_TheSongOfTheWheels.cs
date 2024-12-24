using System;

public class _12_TheSongOfTheWheels
{
    public static void Main(string[] args)
    {
        // Read input value
        int controlNumber = int.Parse(Console.ReadLine());

        // Create a list to hold valid combinations
        List<string> combinations = new List<string>();

        // Determine the possible passwords and print them
        for (int a = 1; a <= 9; a++)
        {
            for (int b = 1; b <= 9; b++)
            {
                for (int c = 1; c <= 9; c++)
                {
                    for (int d = 1; d <= 9; d++)
                    {
                        int sum = (a * b) + (c * d);
                        if (sum == controlNumber && a < b && c > d)
                        {
                            string combination = $"{a}{b}{c}{d}";
                            combinations.Add(combination);
                            Console.Write($"{a}{b}{c}{d} ");
                        }
                    }
                }
            }
        }

        // Print the result
        Console.WriteLine();
        if (combinations.Count >= 4)
        {
            Console.WriteLine("Password: " + combinations[3]);
        }
        else
        {
            Console.WriteLine("No!");
        }
    }
}
