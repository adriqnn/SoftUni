using System;

public class _04_VacationBooksList
{
    public static void Main(string[] args)
    {
        // Read input data
        int numberOfPages = int.Parse(Console.ReadLine());
        int pagesReadPerHour = int.Parse(Console.ReadLine());
        int daysOfReading = int.Parse(Console.ReadLine());

        // Calculate hours needed for reading
        int hoursNeededForReading = numberOfPages / pagesReadPerHour;

        // Calculate hours of reading per day
        int hoursPerDay = hoursNeededForReading / daysOfReading;

        // Print the hours of reading per day
        Console.WriteLine(hoursPerDay);
    }
}
