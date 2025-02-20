using System;

public class _06_EqualSums
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbersArray = Console.ReadLine().Split().Select(int.Parse).ToArray();

        // Add variable
        int arrayIndex = 0;
        bool isEqual = false;

        // Determine if the sum of the array on the left is equal to the sum on the right
        for (int i = 0; i < numbersArray.Length; i++)
        {
            int sumLeft = 0;
            int sumRight = 0;

            for (int j = 0; j < i; j++)
            {
                sumLeft += numbersArray[j];
            }

            for (int j = i + 1; j < numbersArray.Length; j++)
            {
                sumRight += numbersArray[j];
            }

            if (sumLeft == sumRight)
            {
                isEqual = true;
                arrayIndex = i;
                break;
            }
        }

        // Print result
        if (isEqual)
        {
            Console.WriteLine(arrayIndex);
        }
        else
        {
            Console.WriteLine("no");
        }
    }
}
