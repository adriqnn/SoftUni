using System;

public class _02_SleepyTomCat
{
    public static void Main(string[] args)
    {
        // Read the input
        double vacationDays = double.Parse(Console.ReadLine());
        double workingDays = 365 - vacationDays;

        // Calculate playtime during vacation and working days
        double vacationDaysPlaytime = vacationDays * 127;
        double workingDaysPlaytime = workingDays * 63;

        // Calculate the difference between Tom's total playtime and the required norm
        double playtimeNorm = 30000 - (vacationDaysPlaytime + workingDaysPlaytime);

        // Print the result
        if (playtimeNorm >= 0)
        {
            Console.WriteLine("Tom sleeps well");
            Console.WriteLine($"{Math.Floor(playtimeNorm / 60.0)} hours and {playtimeNorm % 60} minutes less for play");
        }
        else
        {
            Console.WriteLine("Tom will run away");
            Console.WriteLine($"{Math.Floor(Math.Abs(playtimeNorm / 60.0))} hours and {Math.Abs(playtimeNorm % 60)} minutes more for play");
        }
    }
}
