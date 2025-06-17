using System;

public class _02_AMinerTask
{
    public static void Main(string[] args)
    {
        // Read input value
        string resource = Console.ReadLine();

        // Add variable
        Dictionary<string, int> resourcesQuantity = new Dictionary<string, int>();

        // Complete miners task
        while (!resource.Equals("stop"))
        {
            int quantity = int.Parse(Console.ReadLine());

            if (!resourcesQuantity.ContainsKey(resource))
            {
                resourcesQuantity[resource] = quantity;
            }
            else
            {
                resourcesQuantity[resource] += quantity;
            }

            resource = Console.ReadLine();
        }

        // Print result
        foreach (var curr in resourcesQuantity)
        {
            Console.WriteLine($"{curr.Key} -> {curr.Value}");
        }
    }
}
