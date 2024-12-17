using System;

public class _04_Walking
{
    public static void Main(string[] args)
    {
        // Read input values
        string input = Console.ReadLine();

        int stepsCounter = 0;

        // Use a while loop to track the steps walked
        while (input != "Going home")
        {
            int steps = int.Parse(input);
            stepsCounter += steps;

            if (stepsCounter >= 10000)
            {
                Console.WriteLine("Goal reached! Good job!");
                Console.WriteLine($"{Math.Abs(10000 - stepsCounter)} steps over the goal!");
                break;
            }

            input = Console.ReadLine();
        }

        // Print result at the end
        if (input == "Going home")
        {
            int stepsAfter = int.Parse(Console.ReadLine());
            stepsCounter += stepsAfter;

            if (stepsCounter >= 10000)
            {
                Console.WriteLine("Goal reached! Good job!");
                Console.WriteLine($"{Math.Abs(10000 - stepsCounter)} steps over the goal!");
            }
            else
            {
                Console.WriteLine($"{Math.Abs(10000 - stepsCounter)} more steps to reach goal.");
            }
        }
    }
}
