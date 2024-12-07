using System;

public class _09_SkiTrip
{
    public static void Main(string[] args)
    {
        // Read input values
        int days = int.Parse(Console.ReadLine());
        string roomType = Console.ReadLine();
        string rating = Console.ReadLine();

        double totalPrice = 0;

        // Calculate total price based on room type and number of days
        if (roomType.Equals("room for one person"))
        {
            totalPrice = (days - 1) * 18.00;
        }
        else if (roomType.Equals("apartment"))
        {
            if (days > 15)
            {
                totalPrice = ((days - 1) * 25.00) * 0.5;
            }
            else if (days >= 10)
            {
                totalPrice = ((days - 1) * 25.00) * 0.65;
            }
            else if (days >= 0)
            {
                totalPrice = ((days - 1) * 25.00) * 0.7;
            }
        }
        else if (roomType.Equals("president apartment"))
        {
            if (days > 15)
            {
                totalPrice = ((days - 1) * 35.00) * 0.8;
            }
            else if (days >= 10)
            {
                totalPrice = ((days - 1) * 35.00) * 0.85;
            }
            else if (days >= 0)
            {
                totalPrice = ((days - 1) * 35.00) * 0.9;
            }
        }

        // Adjust the total price based on the guest rating
        if (rating.Equals("positive"))
        {
            totalPrice *= 1.25; // Increase the price by 25%
        }
        else if (rating.Equals("negative"))
        {
            totalPrice *= 0.9; // Decrease the price by 10%
        }

        // Display the total price with two decimal places
        Console.WriteLine($"{totalPrice:F2}");
    }
}
