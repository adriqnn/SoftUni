using System;
using System.Xml.Linq;

public class _04_ListManipulationBasics
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numberList = Console.ReadLine().Split().Select(int.Parse).ToList();
        string console = Console.ReadLine();

        // Manipulate lists based on the given commands
        while (!console.Equals("end"))
        {
            string[] commandLine = console.Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries);
            string command = commandLine[0];

            if (command.Equals("Add"))
            {
                numberList.Add(int.Parse(commandLine[1]));
            }
            else if (command.Equals("Remove"))
            {
                numberList.Remove(int.Parse(commandLine[1]));
            }
            else if (command.Equals("RemoveAt"))
            {
                numberList.RemoveAt(int.Parse(commandLine[1]));
            }
            else if (command.Equals("Insert"))
            {
                numberList.Insert(int.Parse(commandLine[2]), int.Parse(commandLine[1]));
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", numberList));
    }
}
