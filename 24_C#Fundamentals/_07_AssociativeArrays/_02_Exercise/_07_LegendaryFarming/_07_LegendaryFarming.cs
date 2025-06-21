using System;
using static System.Runtime.InteropServices.JavaScript.JSType;

public class _07_LegendaryFarming
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables
        Dictionary<string, int> legendaries = new Dictionary<string, int>();
        Dictionary<string, int> garbage = new Dictionary<string, int>();
        legendaries["Shadowmourne"] = 0;
        legendaries["Valanyr"] = 0;
        legendaries["Dragonwrath"] = 0;

        bool collected = false;

        // Make legendary statistics
        while (!collected)
        {
            string[] items = input.Split(" ");

            for (int i = 0; i < items.Count(); i += 2)
            {
                string item = items[i + 1].ToLower();
                int quantity = int.Parse(items[i]);

                if (item.Equals("shards"))
                {
                    int shadowmourne = legendaries["Shadowmourne"];

                    if (shadowmourne + quantity >= 250)
                    {
                        Console.WriteLine("Shadowmourne obtained!");
                        collected = true;

                        legendaries["Shadowmourne"] = shadowmourne + quantity - 250;
                        break;
                    }

                    legendaries["Shadowmourne"] = shadowmourne + quantity;

                }
                else if (item.Equals("fragments"))
                {
                    int valanyr = legendaries["Valanyr"];

                    if (valanyr + quantity >= 250)
                    {
                        Console.WriteLine("Valanyr obtained!");
                        collected = true;

                        legendaries["Valanyr"] = valanyr + quantity - 250;
                        break;
                    }

                    legendaries["Valanyr"] = valanyr + quantity;

                }
                else if (item.Equals("motes"))
                {
                    int dragonwrath = legendaries["Dragonwrath"];

                    if (dragonwrath + quantity >= 250)
                    {
                        Console.WriteLine("Dragonwrath obtained!");
                        collected = true;

                        legendaries["Dragonwrath"] = dragonwrath + quantity - 250;
                        break;
                    }

                    legendaries["Dragonwrath"] = dragonwrath + quantity;

                }
                else
                {
                    if (!garbage.ContainsKey(item))
                    {
                        garbage[item] = 0;
                    }

                    int inBags = garbage[item];

                    garbage[item] += quantity;
                }
            }

            if (collected)
            {
                break;
            }

            input = Console.ReadLine();
        }

        // Print result
        foreach (var kvp in legendaries
                     .OrderByDescending(kvp => kvp.Value)
                     .ThenBy(kvp => kvp.Key))
        {
            Console.WriteLine($"{kvp.Key}: {kvp.Value}");
        }

        foreach (var kvp in garbage.OrderBy(kvp => kvp.Key))
        {
            Console.WriteLine($"{kvp.Key}: {kvp.Value}");
        }
    }
}


