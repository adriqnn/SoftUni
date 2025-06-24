using System;

public class _08_LettersChangeNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] console = Console.ReadLine().Split(new[] { ' ', '\t' }, StringSplitOptions.RemoveEmptyEntries);

        // Add variable
        double sum = 0;

        // Solve numbers game
        for (int i = 0; i < console.Length; i++)
        {
            char first = console[i][0];
            char last = console[i][console[i].Length - 1];

            double num = double.Parse(console[i].Substring(1, console[i].Length - 2));
            double sumThisOne = 0;

            if (char.IsLower(first))
            {
                sumThisOne = num * (first - 96);
            }
            else
            {
                sumThisOne = num / (first - 64);
            }

            if (char.IsLower(last))
            {
                sumThisOne += last - 96;
            }
            else
            {
                sumThisOne -= last - 64;
            }

            sum += sumThisOne;
        }

        // Print result
        Console.WriteLine($"{sum:F2}", sum);
    }
}
