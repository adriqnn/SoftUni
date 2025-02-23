using System;
using System.Linq;

public class _05_ListManipulationAdvanced
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split().Select(int.Parse).ToList();
        string console = Console.ReadLine();

        // Add variable
        bool isChanged = false;

        // Manipulate the list based on the given commands
        while (!console.Equals("end"))
        {
            string[] commandLine = console.Split();
            string command = commandLine[0].ToLower();

            if (command.Equals("add"))
            {
                numbersList.Add(int.Parse(commandLine[1]));
                isChanged = true;
            }
            else if (command.Equals("remove"))
            {
                numbersList.Remove(int.Parse(commandLine[1]));
                isChanged = true;
            }
            else if (command.Equals("removeat"))
            {
                numbersList.RemoveAt(int.Parse(commandLine[1]));
                isChanged = true;
            }
            else if (command.Equals("insert"))
            {
                numbersList.Insert(int.Parse(commandLine[2]), int.Parse(commandLine[1]));
                isChanged = true;
            }
            else if (command == "contains")
            {
                Console.WriteLine(numbersList.Contains(int.Parse(commandLine[1])) ? "Yes" : "No such number");
            }
            else if (command == "printeven")
            {
                Console.WriteLine(string.Join(' ', numbersList.Where(n => n % 2 == 0)));
            }
            else if (command == "printodd")
            {
                Console.WriteLine(string.Join(' ', numbersList.Where(n => n % 2 != 0)));
            }
            else if (command == "getsum")
            {
                Console.WriteLine(numbersList.Sum());
            }
            else if (command == "filter")
            {
                if (commandLine[1] == "<")
                {
                    Console.WriteLine(string.Join(' ', numbersList.Where(n => n < int.Parse(commandLine[2]))));
                }
                else if (commandLine[1] == ">")
                {
                    Console.WriteLine(string.Join(' ', numbersList.Where(n => n > int.Parse(commandLine[2]))));
                }
                else if (commandLine[1] == ">=")
                {
                    Console.WriteLine(string.Join(' ', numbersList.Where(n => n >= int.Parse(commandLine[2]))));
                }
                else if (commandLine[1] == "<=")
                {
                    Console.WriteLine(string.Join(' ', numbersList.Where(n => n <= int.Parse(commandLine[2]))));
                }
            }

            console = Console.ReadLine();
        }

        if (isChanged)
        {
            Console.WriteLine(string.Join(' ', numbersList));
        }
    }
}
