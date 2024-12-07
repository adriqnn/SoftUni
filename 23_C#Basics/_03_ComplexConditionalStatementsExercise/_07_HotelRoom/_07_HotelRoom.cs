using System;

public class _07_HotelRoom
{
    public static void Main(string[] args)
    {
        // Read input values
        string month = Console.ReadLine().ToLower();
        int nights = int.Parse(Console.ReadLine());

        double days = (nights * 1.00);

        double studio = 0;
        double apartment = 0;

        // Calculate prices for studio and apartment based on month and number of nights
        if (month.Equals("may") || month.Equals("october"))
        {
            if (nights > 14)
            {
                studio = (days * 50.00) * 0.70;
                apartment = (days * 65.00) * 0.90;
            }
            else if (nights > 7)
            {
                studio = (days * 50.00) * 0.95;
                apartment = (days * 65.00);
            }
            else
            {
                studio = (days * 50.00);
                apartment = (days * 65.00);
            }
        }
        else if (month.Equals("june") || month.Equals("september"))
        {
            if (nights > 14)
            {
                studio = (days * 75.20) * 0.80;
                apartment = (days * 68.70) * 0.90;
            }
            else
            {
                studio = (days * 75.20);
                apartment = (days * 68.70);
            }
        }
        else if (month.Equals("july") || month.Equals("august"))
        {
            studio = 76.00;
            apartment = 77.00;
            if (nights > 14)
            {
                studio = (days * 76.00);
                apartment = (days * 77.00) * 0.90;
            }
            else
            {
                studio = (days * 76.00);
                apartment = (days * 77.00);
            }
        }

        // Display the calculated prices for studio and apartment
        Console.WriteLine($"Apartment: {apartment:F2} lv.");
        Console.WriteLine($"Studio: {studio:F2} lv.");
    }
}
