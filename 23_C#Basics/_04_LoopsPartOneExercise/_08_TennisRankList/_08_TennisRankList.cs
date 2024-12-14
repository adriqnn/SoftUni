using System;

public class _08_TennisRankList
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());
        int score = int.Parse(Console.ReadLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        // Iterate through the tournaments and count the types of results
        for (int i = 0; i < n; i++)
        {
            string rank = Console.ReadLine().ToLower();

            if (rank == "w")
            {
                p1++;
            }
            else if (rank == "f")
            {
                p2++;
            }
            else if (rank == "sf")
            {
                p3++;
            }
        }

        // Calculate points based on tournament results
        int pp1 = p1 * 2000;
        int pp2 = p2 * 1200;
        int pp3 = p3 * 720;
        int score2 = score + pp1 + pp2 + pp3;
        double average = ((pp1 + pp2 + pp3) * 1.0) / n;
        double percentile = ((1.0 * p1) / n) * 100;

        // Print the statistics
        Console.WriteLine($"Final points: {score2}");
        Console.WriteLine($"Average points: {Math.Floor(average):F0}");
        Console.WriteLine($"{percentile:F2}%");
    }
}
