using System;

public class _01_HelloSoftUni
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbersArray = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variable
        List<int> topIntegers = new List<int>();

        // Determine the top integers
        for (int i = 0; i < numbersArray.Length; i++)
        {
            bool isBigger = true;

            for (int j = i + 1; j < numbersArray.Length; j++)
            {
                if (numbersArray[i] <= numbersArray[j])
                {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger)
            {
                topIntegers.Add(numbersArray[i]);
            }
        }

        // Print result
        Console.WriteLine(string.Join(" ", topIntegers);
    }
}
