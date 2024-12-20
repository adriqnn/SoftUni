using System;

public class _04_TrainTheTrainers
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());
        string presentationName = Console.ReadLine();

        // Add variables
        double totalAverage = 0;
        int presentationCount = 0;

        // Evaluate all presentations
        while (!presentationName.Equals("Finish"))
        {
            presentationCount++;
            double presentationAverage = 0;

            for (int i = 1; i <= n; i++)
            {
                double grade = double.Parse(Console.ReadLine());
                presentationAverage += grade;
            }

            totalAverage += presentationAverage / n;

            Console.WriteLine($"{presentationName} - {presentationAverage / n:F2}.");
            presentationName = Console.ReadLine();
        }

        double finalAverage = totalAverage / presentationCount;

        // Print the result
        Console.WriteLine($"Student's final assessment is {finalAverage:F2}.");
    }
}
