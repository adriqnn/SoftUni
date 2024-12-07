using System;

public class _01_Cinema
{
    public static void Main(string[] args)
    {
        // Read input values
        string type = Console.ReadLine();
        int row = int.Parse(Console.ReadLine());
        int number = int.Parse(Console.ReadLine());

        double ticketPrice = 0.00;

        // Calculate the total earnings based on ticket type
        switch (type)
        {
            case "Premiere":
                ticketPrice = 12.00;
                break;
            case "Normal":
                ticketPrice = 7.50;
                break;
            case "Discount":
                ticketPrice = 5.00;
                break;
        }

        // Calculate earnings
        double totalEarnings = ticketPrice * row * number;

        // Display the total earnings formatted with 2 decimal places
        Console.WriteLine("Total earnings: {0:F2} leva", totalEarnings);
    }
}
