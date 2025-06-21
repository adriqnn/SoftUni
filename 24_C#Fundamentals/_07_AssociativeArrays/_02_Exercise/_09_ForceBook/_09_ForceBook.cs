using System;
using System.Linq;
using System.Xml.Linq;

public class _09_ForceBook
{
    public static void Main(string[] args)
    {
        // Read input value
        string inputLine = Console.ReadLine();

        // Add variables
        Dictionary<string, string> users = new Dictionary<string, string>();
        Dictionary<string, List<string>> forceAndUsers = new Dictionary<string, List<string>>();

        // Create database for force users
        while (inputLine != "Lumpawaroo")
        {
            if (inputLine.Contains(" | "))
            {
                string[] line = inputLine.Split(" | ");

                string side = line[0];
                string name = line[1];

                if (!users.ContainsKey(name) && !forceAndUsers.ContainsKey(side))
                {
                    forceAndUsers[side] = new List<string>();
                    users[name] = side;

                    forceAndUsers[side].Add(name);

                }
                else if (!users.ContainsKey(name) && forceAndUsers.ContainsKey(side))
                {
                    users[name] = side;

                    forceAndUsers[side].Add(name);

                }
                else if (users.ContainsKey(name))
                {
                    inputLine = Console.ReadLine();
                    continue;
                }
            }
            else if (inputLine.Contains("->"))
            {
                string[] line = inputLine.Split(" -> ");

                string name = line[0];
                string side = line[1];

                if (!users.ContainsKey(name) && !forceAndUsers.ContainsKey(side))
                {
                    forceAndUsers[side] = new List<string>();
                    users[name] = side;

                    forceAndUsers[side].Add(name);

                    Console.WriteLine($"{name} joins the {side} side!");

                }
                else if (!users.ContainsKey(name) && forceAndUsers.ContainsKey(side))
                {
                    users[name] = side;

                    forceAndUsers[side].Add(name);

                    Console.WriteLine($"{name} joins the {side} side!");

                }
                else if (users.ContainsKey(name) && forceAndUsers.ContainsKey(side))
                {
                    forceAndUsers[users[name]].Remove(name);
                    users[name] = side;

                    forceAndUsers[side].Add(name);

                    Console.WriteLine($"{name} joins the {side} side!");

                }
                else if (users.ContainsKey(name) && !forceAndUsers.ContainsKey(side))
                {
                    forceAndUsers[users[name]].Remove(name);
                    users[name] = side;

                    forceAndUsers[side] = new List<string>();
                    forceAndUsers[side].Add(name);

                    Console.WriteLine($"{name} joins the {side} side!");
                }
            }

            inputLine = Console.ReadLine();
        }

        // Print result
        foreach (var entry in forceAndUsers)
        {
            if (entry.Value.Count > 0)
            {
                Console.WriteLine($"Side: {entry.Key}, Members: {entry.Value.Count}");
                Console.WriteLine(string.Join("\n", entry.Value.Select(element => $"! {element}")));
            }
        }
    }
}
