using System;
using System.Linq;

public class _03_HouseParty
{
    public static void Main(string[] args)
    {
        // Read input values
        int n = int.Parse(Console.ReadLine());

        // Add variable
        List<string> partyList = new List<string>();

        // Determine who is going to the party
        for (int i = 0; i < n; i++)
        {
            string[] commandline = Console.ReadLine().Split();

            if (commandline[2].Equals("going!"))
            {
                if (!partyList.Contains(commandline[0]))
                {
                    partyList.Add(commandline[0]);
                }
                else
                {
                    Console.WriteLine($"{commandline[0]} is already in the list!");
                }
            }
            else
            {
                if (partyList.Contains(commandline[0]))
                {
                    partyList.Remove(commandline[0]);
                }
                else
                {
                    Console.WriteLine($"{commandline[0]} is not in the list!");
                }
            }
        }

        // Print result
        Console.WriteLine(string.Join(Environment.NewLine, partyList));
    }
}
