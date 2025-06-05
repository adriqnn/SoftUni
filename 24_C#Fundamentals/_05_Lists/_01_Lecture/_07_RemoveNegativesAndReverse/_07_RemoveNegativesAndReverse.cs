using System;
using System.Globalization;
using System.Xml.Linq;

public class _07_RemoveNegativesAndReverse
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToList();

        // Remove negative numbers
        numbersList.RemoveAll(n => n < 0);

        // Reverse list
        numbersList.Reverse();

        // Print result
        if (numbersList.Count == 0)
        {
           Console.WriteLine("empty");
        }
        else
        {
            Console.WriteLine(string.Join(" ", numbersList));
        }
    }
}
