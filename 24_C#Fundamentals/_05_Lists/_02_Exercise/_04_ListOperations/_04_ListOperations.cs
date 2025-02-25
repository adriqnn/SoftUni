using System;
using System.Xml.Linq;

public class _04_ListOperations
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split().Select(int.Parse).ToList();
        string console = Console.ReadLine();

        // Transform the list based on the given commands
        while (!console.Equals("End"))
        {
            string[] commandLine = console.Split();

            if (commandLine[0].Equals("Add"))
            {
                numbersList.Add(int.Parse(commandLine[1]));
            }
            else if (commandLine[0].Equals("Insert"))
            {
                if (int.Parse(commandLine[2]) >= 0 && int.Parse(commandLine[2]) < numbersList.Count)
                {
                    numbersList.Insert(int.Parse(commandLine[2]), int.Parse(commandLine[1]));
                }
                else
                {
                    Console.WriteLine("Invalid index");
                }
            }
            else if (commandLine[0].Equals("Remove"))
            {
                if (int.Parse(commandLine[1]) >= 0 && int.Parse(commandLine[1]) < numbersList.Count)
                {
                    numbersList.RemoveAt(int.Parse(commandLine[1]));
                }
                else
                {
                    Console.WriteLine("Invalid index");
                }
            }
            else if (commandLine[0].Equals("Shift"))
            {
                int n = int.Parse(commandLine[2]);

                if (commandLine[1].Equals("left"))
                {
                    for (int i = 0; i < n; i++)
                    {
                        numbersList.Add(numbersList[0]);
                        numbersList.RemoveAt(0);
                    }
                }
                else if (commandLine[1].Equals("right"))
                {
                    for (int i = 0; i < n; i++)
                    {
                        numbersList.Insert(0, numbersList[numbersList.Count - 1]);
                        numbersList.RemoveAt(numbersList.Count - 1);
                    }
                }
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", numbersList));
    }
}
