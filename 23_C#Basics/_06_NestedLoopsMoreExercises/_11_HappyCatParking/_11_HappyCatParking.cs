using System;

public class _11_HappyCatParking
{
    public static void Main(string[] args)
    {
        // Read input value
        int numberOfDays = int.Parse(Console.ReadLine());
        int numberOfHoursPerDay = int.Parse(Console.ReadLine());

        // Add variable
        double totalSum = 0;

        // Calculate daily parking fee
        for (int day = 1; day <= numberOfDays; day++)
        {
            double dailySum = 0;
            for (int hour = 1; hour <= numberOfHoursPerDay; hour++)
            {
                if (day % 2 != 0)
                {
                    if (hour % 2 == 0)
                    {
                        dailySum += 1.25;
                    }
                    else
                    {
                        dailySum += 1;
                    }
                }
                else
                {
                    if (hour % 2 != 0)
                    {
                        dailySum += 2.50;
                    }
                    else
                    {
                        dailySum += 1;
                    }
                }
            }

            totalSum += dailySum;
            Console.WriteLine($"Day: {day} - {dailySum:F2} leva");
        }

        // Print the total amount
        Console.WriteLine($"Total: {totalSum:F2} leva");
    }
}
