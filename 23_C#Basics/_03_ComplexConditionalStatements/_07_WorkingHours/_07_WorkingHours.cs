using System;

public class _07_WorkingHours
{
    public static void Main(string[] args)
    {
        // Read input values for hours and day
        int hours = int.Parse(Console.ReadLine());
        string day = Console.ReadLine();

        // Set a check for the working hours of the store
        bool isOpen = (hours >= 10 && hours <= 18);

        // Determine if the store is opened or closed and print the result
        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            case "Saturday":
                if (isOpen)
                {
                    Console.WriteLine("open");
                }
                else
                {
                    Console.WriteLine("closed");
                }
                break;
            default:
                Console.WriteLine("closed");
                break;
        }
    }
}

