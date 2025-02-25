using System;
using System.Text.RegularExpressions;

public class _07_AppendArrays
{
    public static void Main(string[] args)
    {
        // Read input values
        List<string> numbersList = Console.ReadLine().Split(new char[] { '|' }, StringSplitOptions.RemoveEmptyEntries).ToList();

        // Reverse the input
        numbersList.Reverse();

        string result = string.Join(" ", numbersList);
        result = Regex.Replace(result, @"\s+", " ");

        // Print result
        Console.WriteLine(result);
    }
}
