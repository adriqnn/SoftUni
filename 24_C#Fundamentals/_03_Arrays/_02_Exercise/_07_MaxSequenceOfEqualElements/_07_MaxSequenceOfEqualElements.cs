using System;

public class _07_MaxSequenceOfEqualElements
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbersArray = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variables
        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestStartIndex = 0;

        // Determine the longest sequence of equal numbers
        for (int i = 1; i < numbersArray.Length; i++)
        {
            if (numbersArray[i] == numbersArray[i - 1])
            {
                length++;
            }
            else
            {
                length = 1;
                startIndex = i;
            }

            if (length > maxLength)
            {
                maxLength = length;
                bestStartIndex = startIndex;
            }
        }

        // Print result
        for (int i = bestStartIndex; i < bestStartIndex + maxLength; i++)
        {
            Console.Write(numbersArray[i] + " ");
        }
    }
}
