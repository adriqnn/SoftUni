using System;
using System.Linq;
using System.Data;

public class _11_TreasureHunt
{
    public static void Main(string[] args)
    {
        // Read input values
        List<string> loot = Console.ReadLine().Split("|").ToList();
        string input = Console.ReadLine();

        // Accept commands for the treasure hunt
        while (!input.Equals("Yohoho!"))
        {
            string[] commands = input.Split(' ', StringSplitOptions.RemoveEmptyEntries);
            string command = commands[0];

            if (command.Equals("Loot"))
            {
                for (int i = 1; i < commands.Length; i++)
                {
                    if (!loot.Contains(commands[i]))
                    {
                        loot.Insert(0, commands[i]);
                    }
                }
            }
            else if (command.Equals("Drop"))
            {
                int index = int.Parse(commands[1]);

                if (index < loot.Count && index >= 0)
                {
                    string removed = loot[index];
                    loot.RemoveAt(index);
                    loot.Add(removed);
                }
            }
            else if (command.Equals("Steal"))
            {
                int count = int.Parse(commands[1]);
                List<string> stolen = new List<string>();

                if (count >= loot.Count)
                {
                    stolen.AddRange(loot);
                    loot.Clear();
                }
                else
                {
                    for (int i = 0; i < count; i++)
                    {
                        stolen = loot.GetRange(loot.Count - count, count);
                        loot.RemoveRange(loot.Count - count, count);
                    }
                }

                Console.WriteLine(string.Join(", ", stolen));
            }

            input = Console.ReadLine();
        }

        // Print result
        if (loot.Count == 0)
        {
            Console.WriteLine("Failed treasure hunt.");
        }
        else
        {
            double totalLength = loot.Sum(item => item.Length);
            double averageGain = totalLength / loot.Count;
            Console.WriteLine($"Average treasure gain: {averageGain:F2} pirate credits.");
        }
    }
}
