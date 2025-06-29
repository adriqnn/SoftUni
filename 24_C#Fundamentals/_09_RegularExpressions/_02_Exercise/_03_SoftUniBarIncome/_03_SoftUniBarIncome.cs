using System;
using System.Text.RegularExpressions;

public class _03_SoftUniBarIncome
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables
        string regex = "\\%(?<customer>[A-Z][a-z]+)\\%[^|%.$]*<(?<product>\\w+)>[^|%.$]*\\|(?<count>[0-9]+)\\|[^|%.$\\d]*(?<price>[0-9]+\\.?[0-9][0-9]?)\\$";
        Regex pattern = new Regex(regex);
        double total = 0;

        // Calculate the income of a bar
        while (!input.Equals("end of shift"))
        {
            Match matcher = pattern.Match(input);

            if (matcher.Success)
            {
                string customer = matcher.Groups["customer"].Value;
                string product = matcher.Groups["product"].Value;
                int count = int.Parse(matcher.Groups["count"].Value);
                double price = double.Parse(matcher.Groups["price"].Value);

                total += count * price;

                Console.WriteLine($"{customer}: {product} - {count * price:F2}");
            }

            input = Console.ReadLine();
        }

        // Print result
        Console.WriteLine($"Total income: {total:F2}");
    }
}
