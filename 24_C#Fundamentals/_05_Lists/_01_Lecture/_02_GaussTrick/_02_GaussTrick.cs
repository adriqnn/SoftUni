using System;
using System.Xml.Linq;
using System.Globalization;

public class _02_GaussTrick
{
    public static void Main(string[] args)
    {
        // Read input values
        List<int> listNumbers = Console.ReadLine().Split().Select(int.Parse).ToList();

        // Add variable
        int middle = listNumbers.Count / 2;

        // Sum numbers in the given pattern
        for (int i = 0; i < middle; i++)
        {
            listNumbers[i] = listNumbers[i] + listNumbers[listNumbers.Count - 1];
            listNumbers.RemoveAt(listNumbers.Count - 1);
        }

        //System.out.println(listNumbers);
        Console.WriteLine(string.Join(" ", listNumbers));
    }
}
