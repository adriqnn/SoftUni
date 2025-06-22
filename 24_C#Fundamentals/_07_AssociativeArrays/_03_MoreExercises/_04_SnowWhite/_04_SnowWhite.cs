using System;

public class _04_SnowWhite
{
    public static void Main(string[] args)
    {
        // Read input value
        string input = Console.ReadLine();

        // Add variables
        Dictionary<string, int> dwarfs = new Dictionary<string, int>();
        Dictionary<string, int> colorGroups = new Dictionary<string, int>();

        // Create database for dwarfs
        while (!input.Equals("Once upon a time"))
        {
            string[] information = input.Split(" <:> ");

            string name = information[0];
            string color = information[1];
            int physics = int.Parse(information[2]);

            string key = name + ">>>>>" + color;

            if (!colorGroups.ContainsKey(color))
            {
                colorGroups[color] = 0;
            }

            if (!dwarfs.ContainsKey(key))
            {
                dwarfs[key] = physics;
                colorGroups[color]++;
            }
            else
            {
                if (dwarfs[key] < physics)
                {
                    dwarfs[key] = physics;
                }
            }

            input = Console.ReadLine();
        }

        // Print result
        var sorted = dwarfs.OrderByDescending(x => x.Value).ThenByDescending(x =>
        {
            string color = x.Key.Split(">>>>>")[1];
            return colorGroups[color];
        });
        foreach (var key in sorted) 
        {
            string[] parts = key.Key.Split(">>>>>");
            string name = parts[0];
            string color = parts[1];
            int physics = key.Value;

            Console.WriteLine($"({color}) {name} <-> {physics}");
        }
    }
}
