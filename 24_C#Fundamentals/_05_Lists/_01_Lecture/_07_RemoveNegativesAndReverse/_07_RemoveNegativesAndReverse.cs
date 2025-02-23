using System;
using System.Globalization;
using System.Xml.Linq;

public class _07_RemoveNegativesAndReverse
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList = Console.ReadLine().Split().Select(int.Parse).ToList();

        // Remove negative numbers
        for (int i = 0; i < numbersList.Count; i++)
        {
            if (numbersList[i] < 0)
            {
                numbersList.Remove(i);
                i--;
            }
        }

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
