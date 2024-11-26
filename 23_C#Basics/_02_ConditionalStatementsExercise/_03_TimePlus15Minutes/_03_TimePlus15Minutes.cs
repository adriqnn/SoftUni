using System;

public class _03_TimePlus15Minutes
{
    public static void Main(string[] args)
    {
        // Read the input hours and minutes
        int hours = int.Parse(Console.ReadLine());
        int minutes = int.Parse(Console.ReadLine());

        // Calculate the total time in minutes after adding 15 minutes
        int totalTime = minutes + 15;

        // Adjust hours and remaining minutes if needed
        if (totalTime >= 60)
        {
            hours = hours + 1;
            totalTime = totalTime % 60;
        }

        // Adjust hours if exceeding 24
        if (hours >= 24)
        {
            hours = hours % 24;
        }

        // Print the result in the desired format
        if (totalTime < 10)
        {
            Console.WriteLine("{0}:0{1}", hours, totalTime);
        }
        else
        {
            Console.WriteLine("{0}:{1}", hours, totalTime);
        }
    }
}
