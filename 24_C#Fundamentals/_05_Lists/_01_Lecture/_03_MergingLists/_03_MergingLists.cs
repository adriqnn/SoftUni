using System;
using System.Linq;

public class _03_MergingLists
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> numbersList1 = Console.ReadLine().Split().Select(int.Parse).ToList();
        List<int> numbersList2 = Console.ReadLine().Split().Select(int.Parse).ToList();

        // Add variables
        List<int> newNumbersList1and2 = new List<int>();
        int sizeOfSmaller = Math.Min(numbersList1.Count, numbersList2.Count);

        // Merge the lists based on the smaller one
        for (int i = 0; i < sizeOfSmaller; i++)
        {
            newNumbersList1and2.Add(numbersList1[i]);
            newNumbersList1and2.Add(numbersList2[i]);
        }

        // Continue merging the lists
        if (numbersList1.Count < numbersList2.Count)
        {
            for (int i = sizeOfSmaller; i < numbersList2.Count; i++)
            {
                newNumbersList1and2.Add(numbersList2[i]);
            }
        }
        else
        {
            for (int i = sizeOfSmaller; i < numbersList1.Count; i++)
            {
                newNumbersList1and2.Add(numbersList1[i]);
            }
        }

        // Print result
        Console.WriteLine(string.Join(" ", newNumbersList1and2));
    }
}
