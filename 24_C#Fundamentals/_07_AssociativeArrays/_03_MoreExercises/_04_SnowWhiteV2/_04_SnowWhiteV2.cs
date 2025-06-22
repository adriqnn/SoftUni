using System;

public class _04_SnowWhiteV2
{
    public static void Main(string[] args)
    {
        // Add variables
        string input;
        Dictionary<string, int> dwarfs = new Dictionary<string, int>();
        Dictionary<string, int> colorGroups = new Dictionary<string, int>();

        // Read input values and create database for dwarfs
        while (!"Once upon a time".Equals(input = Console.ReadLine()))
        {
            string[] information = input.Split(" <:> ");

            string dwarf = information[0] + ">>>>>" + information[1];
            string color = information[1];
            int physics = int.Parse(information[2]);

            if (!colorGroups.ContainsKey(color))
            {
                colorGroups[color] = 0;
            }

            colorGroups[color]++;

            if (dwarfs.ContainsKey(dwarf))
            {
                if (dwarfs[dwarf] < physics)
                {
                    dwarfs[dwarf] = physics;
                    colorGroups[color]--;
                }
            }
            else
            {
                dwarfs[dwarf] = physics;
            }
        }

        var sorted = dwarfs.OrderByDescending(x => x.Value).ThenByDescending(x =>
        {
            string color = x.Key.Split(">>>>>")[1];
            return colorGroups[color];
        });

        // Print result
        foreach (var pair in sorted)
        {
            string[] parts = pair.Key.Split(">>>>>");
            string name = parts[0];
            string color = parts[1];
            int physics = pair.Value;

            Console.WriteLine($"({color}) {name} <-> {physics}");
        }
    }
}

// Create practice Dwarf class
class Dwarf
{
    private string Name { get; set; }
    private string Color { get; set; }
    private int Physics { get; set; }
    private int ColorGrp { get; set; }

    public Dwarf(string name, string color, int physics, int colorGrp)
    {
        this.Name = name;
        this.Color = color;
        this.Physics = physics;
        this.ColorGrp = colorGrp;
    }
}
