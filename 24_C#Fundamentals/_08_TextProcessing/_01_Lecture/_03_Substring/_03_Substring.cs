using System;
using System.Linq;

public class _03_Substring
{
    public static void Main(string[] args)
    {
        // Read input values
        string stringToRemove = Console.ReadLine();
        string consoleString = Console.ReadLine();

        // Remove the string from console
        while (consoleString.Contains(stringToRemove))
        {
            int index = consoleString.IndexOf(stringToRemove);
            if (index != -1)
            {
                consoleString = consoleString.Remove(index, stringToRemove.Length);
            }
        }

        // Print result
        Console.WriteLine(consoleString);
    }
}
