using System;

public class _03_Vacation
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());
        string person = Console.ReadLine();
        string day = Console.ReadLine();

        // Add variable
        double price = 0;

        // Calculate the price of the vacation
        if (day == "Friday")
        {
            switch (person)
            {
                case "Students":
                    price = 8.45;
                    break;
                case "Business":
                    price = 10.90;
                    break;
                case "Regular":
                    price = 15.00;
                    break;
            }
        }
        else if (day == "Saturday")
        {
            switch (person)
            {
                case "Students":
                    price = 9.80;
                    break;
                case "Business":
                    price = 15.60;
                    break;
                case "Regular":
                    price = 20.00;
                    break;
            }
        }
        else
        {
            switch (person)
            {
                case "Students":
                    price = 10.46;
                    break;
                case "Business":
                    price = 16.00;
                    break;
                case "Regular":
                    price = 22.50;
                    break;
            }
        }

        // Calculate additional discounts
        double total = n * price;
        if (person == "Students" && n >= 30)
        {
            total *= 0.85;
        }
        else if (person == "Business" && n >= 100)
        {
            total -= 10 * price;
        }
        else if (person == "Regular" && n >= 10 && n < 20)
        {
            total *= 0.95;
        }

        // Print result
        Console.WriteLine($"Total price: {total:F2}");
    }
}
