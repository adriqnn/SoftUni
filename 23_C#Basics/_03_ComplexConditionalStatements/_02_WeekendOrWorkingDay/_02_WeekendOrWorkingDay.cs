using System;

public class _02_WeekendOrWorkingDay
{
    public static void Main(string[] args)
    {
        // Read input value day from the console
        string day = Console.ReadLine();

        // Print whether the day if valid is working day or weekend day
        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                Console.WriteLine("Working day");
                break;
            case "Saturday":
            case "Sunday":
                Console.WriteLine("Weekend");
                break;
            default:
                Console.WriteLine("Error");
                break;
        }
    }
}
