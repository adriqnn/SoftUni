using System;
using System.Xml.Linq;

public class _02_ChangeList
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split().Select(int.Parse).ToList();
        string console = Console.ReadLine();

        // Change the list based on the commands
        while (!console.Equals("end"))
        {
            string[] commandLine = console.Split();
            string command = commandLine[0];

            if (command.Equals("Delete"))
            {
                int element = int.Parse(commandLine[1]);
                numbersList.RemoveAll(e => e == element);
            }
            else if (command.Equals("Insert"))
            {
                int index = int.Parse(commandLine[2]);
                int num = int.Parse(commandLine[1]);

                numbersList.Insert(index, num);
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", numbersList));
    }
}
