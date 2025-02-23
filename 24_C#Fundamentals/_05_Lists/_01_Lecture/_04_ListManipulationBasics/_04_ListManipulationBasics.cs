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
            string commandline = console.Split()[0];

            if (commandline.Equals("Add"))
            {
                numberList.Add(int.Parse(console.Split()[1]));
            }
            else if (commandline.Equals("Remove"))
            {
                numberList.Remove(int.Parse(console.Split()[1]));
            }
            else if (commandline.Equals("RemoveAt"))
            {
                numberList.Remove(int.Parse(console.Split()[1]));
            }
            else if (commandline.Equals("Insert"))
            {
                numberList.Insert(int.Parse(console.Split()[2]), int.Parse(console.Split()[1]));
            }

            console = Console.ReadLine();
        }

        // Print result
        Console.WriteLine(string.Join(" ", numberList));
    }
}
