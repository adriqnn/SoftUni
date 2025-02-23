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
            string[] commandline = console.Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);
            string command = commandline[0];

            if (command.Equals("Add"))
            {
                numberList.Add(int.Parse(commandline[1]));
            }
            else if (command.Equals("Remove"))
            {
                numberList.Remove(int.Parse(commandline[1]));
            }
            else if (command.Equals("RemoveAt"))
            {
                numberList.RemoveAt(int.Parse(commandline[1]));
            }
            else if (command.Equals("Insert"))
            {
                numberList.Insert(int.Parse(commandline[2]), int.Parse(commandline[1]));
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", numberList));
    }
}
