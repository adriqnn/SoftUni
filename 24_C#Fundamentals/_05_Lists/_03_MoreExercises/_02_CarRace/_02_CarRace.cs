using System;

public class _02_CarRace
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split(" ").Select(int.Parse).ToList();

        // Add variables
        double timeFirstRacer = 0;
        double timeSecondRacer = 0;

        // Determine the time of the first racer
        for (int i = 0; i < numbersList.Count / 2; i++)
        {
            if (numbersList[i] == 0)
            {
                timeFirstRacer *= 0.8;
                continue;
            }

            timeFirstRacer += numbersList[i];
        }

        // Determine the time of the second racer
        for (int i = numbersList.Count - 1; i > numbersList.Count / 2; i--)
        {
            if (numbersList[i] == 0)
            {
                timeSecondRacer *= 0.8;
                continue;
            }

            timeSecondRacer += numbersList[i];
        }

        // Print result
        if (timeFirstRacer < timeSecondRacer)
        {
            Console.WriteLine($"The winner is left with total time: {timeFirstRacer}");
        }
        else if (timeFirstRacer > timeSecondRacer)
        {
            Console.WriteLine($"The winner is right with total time: {timeSecondRacer}");
        }
    }
}
