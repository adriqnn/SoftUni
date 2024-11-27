using System;

public class _06_WorldSwimmingRecord
{
    public static void Main(string[] args)
    {
        // Read the input values
        double record = double.Parse(Console.ReadLine());
        double distance = double.Parse(Console.ReadLine());
        double seconds = double.Parse(Console.ReadLine());

        // Calculate the time it takes to swim the distance
        double swimDistanceSeconds = distance * seconds;

        // Calculate the resistance time due to each 15 meters
        double resistanceSeconds = Math.Floor(distance / 15) * 12.5;

        // Calculate the total time including resistance
        double totalTime = swimDistanceSeconds + resistanceSeconds;

        // Calculate the difference between the new record and the given record
        double timeDifference = Math.Abs(totalTime - record);

        // Compare the total time with the given record
        if (totalTime < record)
        {
            Console.WriteLine("Yes, he succeeded! The new world record is {0:F2} seconds.", totalTime);
        }
        else
        {
            Console.WriteLine("No, he failed! He was {0:F2} seconds slower.", timeDifference);
        }
    }
}
