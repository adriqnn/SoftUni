using System;

public class _02_BikeRace
{
    public static void Main(string[] args)
    {
        // Read input values
        int youngParticipants = int.Parse(Console.ReadLine());
        int seniorParticipants = int.Parse(Console.ReadLine());
        string trackType = Console.ReadLine().ToLower();

        double collectedMoney = 0;

        // Calculate the collected money based on the track type
        if (trackType == "trail")
        {
            collectedMoney = (youngParticipants * 5.50) + (seniorParticipants * 7.00);
        }
        else if (trackType == "cross-country")
        {
            if ((youngParticipants + seniorParticipants) >= 50)
            {
                collectedMoney = ((youngParticipants * 8.00) + (seniorParticipants * 9.50)) * 0.75;
            }
            else
            {
                collectedMoney = (youngParticipants * 8.00) + (seniorParticipants * 9.50);
            }
        }
        else if (trackType == "downhill")
        {
            collectedMoney = (youngParticipants * 12.25) + (seniorParticipants * 13.75);
        }
        else if (trackType == "road")
        {
            collectedMoney = (youngParticipants * 20) + (seniorParticipants * 21.50);
        }

        // Calculate the expenses
        double expenses = collectedMoney * 0.05;

        // Print the sum
        Console.WriteLine($"{(collectedMoney - expenses):F2}");
    }
}
