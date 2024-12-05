using System;

public class _08_CinemaTicket
{
    public static void Main(string[] args)
    {
        // Read input value
        string day = Console.ReadLine();

        // Print the price of the ticket based on the day
        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Friday":
                Console.WriteLine(12);
                break;
            case "Wednesday":
            case "Thursday":
                Console.WriteLine(14);
                break;
            default:
                Console.WriteLine(16);
                break;
        }
    }
}
