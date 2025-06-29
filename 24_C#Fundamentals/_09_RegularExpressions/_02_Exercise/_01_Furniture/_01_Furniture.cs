using System;
using System.Text.RegularExpressions;

public class _01_Furniture
{
    public static void Main(string[] args)
    {
        // Read input value
        string console = Console.ReadLine();

        // Add variables
        string regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]+)";
        Regex pattern = new Regex(regex);
        List<string> furnitureList = new List<string>();
        double totalMoney = 0;

        // Purchase furniture
        while (!console.Equals("Purchase"))
        {
            Match matcher = pattern.Match(console);

            if (matcher.Success)
            {
                string furniture = matcher.Groups["furniture"].Value;

                double price = double.Parse(matcher.Groups["price"].Value);
                int quantity = int.Parse(matcher.Groups["quantity"].Value);

                furnitureList.Add(furniture);

                totalMoney += price * quantity;
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine("Bought furniture:");
        furnitureList.ForEach(i => Console.WriteLine(i));
        Console.WriteLine($"Total money spend: {totalMoney:F2}");
    }
}
