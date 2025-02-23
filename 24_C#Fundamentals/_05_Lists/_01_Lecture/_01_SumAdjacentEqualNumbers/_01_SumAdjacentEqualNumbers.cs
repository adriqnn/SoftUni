using System;
using System.Globalization;

public class _01_SumAdjacentEqualNumbers
{
    public static void Main(string[] args)
    {
        // Read input values
        List<double> listNumbers = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries).Select(double.Parse).ToList();

        // Sum adjacent numbers in list
        for (int i = 0; i < listNumbers.Count - 1; i++)
        {
            if (listNumbers[i] == listNumbers[i + 1])
            {
                double sum = listNumbers[i] + listNumbers[i + 1];
                listNumbers[i] = sum;
                listNumbers.RemoveAt(i + 1);
                i = -1;
            }
        }

        // Print result
        string output = string.Join(" ", listNumbers.Select(n => n.ToString("0.#", CultureInfo.InvariantCulture)));
        Console.WriteLine(output);
    }
}
