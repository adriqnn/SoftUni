using System;

public class _05_Orders
{
    public static void Main(string[] args)
    {
        // Read input values
        string item = Console.ReadLine();
        double quantity = double.Parse(Console.ReadLine());

        // Create method for incoming orders
        whatIsThePrice(item, quantity);
    }

    private static void whatIsThePrice(String item, double quantity)
    {
        if (item.Equals("coffee"))
        {
            Console.WriteLine($"{1.50 * quantity:F2}");
        }
        else if (item.Equals("water"))
        {
            Console.WriteLine($"{1.00 * quantity:F2}");
        }
        else if (item.Equals("coke"))
        {
            Console.WriteLine($"{1.40 * quantity:F2}");
        }
        else if (item.Equals("snacks"))
        {
            Console.WriteLine($"{2.00 * quantity:F2}");
        }
    }
}
