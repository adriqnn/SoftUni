using System;

public class _01_DayOfWeek
{
    public static void Main(string[] args)
    {
        // Read input value
        int n = int.Parse(Console.ReadLine());

        // Add variable
        string[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        // Print result
        try
        {
            Console.WriteLine(days[n - 1]);
        }
        catch (Exception e)
        {
            Console.WriteLine("Invalid day!");
        }
    }
}
