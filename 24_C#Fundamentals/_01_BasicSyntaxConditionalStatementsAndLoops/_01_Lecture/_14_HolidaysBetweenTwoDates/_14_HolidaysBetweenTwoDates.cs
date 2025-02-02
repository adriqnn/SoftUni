using System;
using System.Globalization;

public class _14_HolidaysBetweenTwoDates
{
    public static void Main(string[] args)
    {
        // Read input values
        string dateOne = Console.ReadLine();
        string dateTwo = Console.ReadLine();

        DateTime startDate = DateTime.ParseExact(dateOne, "d.M.yyyy", CultureInfo.InvariantCulture);
        DateTime endDate = DateTime.ParseExact(dateTwo, "d.M.yyyy", CultureInfo.InvariantCulture);

        // Add variables
        int holidaysCount = 0;

        for (DateTime date = startDate; date <= endDate; date = date.AddDays(1))
        {
            // Check if the day is Saturday or Sunday.
            if (date.DayOfWeek == DayOfWeek.Saturday || date.DayOfWeek == DayOfWeek.Sunday)
            {
                holidaysCount++;
            }
        }

        // Print result
        Console.WriteLine(holidaysCount);
    }
}
