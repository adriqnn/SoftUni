using System;

public class _03_Orders
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variable
        Dictionary<string, List<double>> orders = new Dictionary<string, List<double>>();

        // Combine all the orders and sort them
        while (input != "buy")
        {
            string[] order = input.Split(new[] {' '}, StringSplitOptions.RemoveEmptyEntries);

            string item = order[0];
            double price = double.Parse(order[1]);
            double quantity = double.Parse(order[2]);

            if (!orders.ContainsKey(item))
            {
                orders[item] = new List<double> { price, quantity };
            }
            else
            {
                if (orders[item][0] != price)
                {
                    orders[item][0] = price;
                }

                orders[item][1] += quantity;
            }

            input = Console.ReadLine();
        }

        // Print result
        foreach (KeyValuePair<string, List<double>> item in orders)
        {
            Console.WriteLine($"{item.Key} -> {(item.Value[0] * item.Value[1]):F2}");
        }
    }
}
