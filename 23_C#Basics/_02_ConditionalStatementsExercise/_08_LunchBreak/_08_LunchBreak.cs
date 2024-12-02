using System;

public class _08_LunchBreak
{
    public static void Main(string[] args)
    {
        // Read the input values
        string nameOfTheSeries = Console.ReadLine();
        int episodeLength = int.Parse(Console.ReadLine());
        int breakLength = int.Parse(Console.ReadLine());

        // Calculate time allocated for lunch and break
        double lunchTime = breakLength * 1.0 / 8;
        double breakTime = breakLength * 1.0 / 4;
        double timeLeft = breakLength - lunchTime - breakTime;

        // Compare time left with episode length and print the appropriate message
        if (timeLeft >= episodeLength)
        {
            Console.WriteLine("You have enough time to watch {0} and left with {1:F0} minutes free time.", nameOfTheSeries, Math.Ceiling(timeLeft - episodeLength));
        }
        else
        {
            Console.WriteLine("You don't have enough time to watch {0}, you need {1:F0} more minutes.", nameOfTheSeries, Math.Ceiling(episodeLength - timeLeft));
        }
    }
}
