using System;

public class _04_BackIn30Minutes
{
    public static void Main(string[] args)
    {
        // Read input values
        int hours = int.Parse(Console.ReadLine());
        int minutes = int.Parse(Console.ReadLine());

        // Add variables
        int timePLus30 = hours * 60 + minutes + 30;
        int newHour = timePLus30 / 60;
        int newMinutes = timePLus30 % 60;

        if (newHour > 23)
        {
            newHour = 0;
        }

        // Print result
        Console.WriteLine($"{newHour}:{newMinutes:D2}");
    }
}
