using System;

public class _06_EqualArrays
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numberOneArray = Console.ReadLine().Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();
        int[] numberTwoArray = Console.ReadLine().Split(new char[] {' '}, StringSplitOptions.RemoveEmptyEntries).Select(int.Parse).ToArray();

        // Add variables
        int sum = 0;
        bool isEqual = true;

        // Compare each element of the arrays
        for (int i = 0; i < numberOneArray.Length; i++)
        {
            if (numberOneArray[i] == numberTwoArray[i])
            {
                sum += numberOneArray[i];
            }
            else
            {
                isEqual = false;
                sum = i;
                break;
            }
        }

        // Print result
        if (isEqual)
        {
            Console.WriteLine("Arrays are identical. Sum: " + sum);
        }
        else
        {
            Console.WriteLine("Arrays are not identical. Found difference at " + sum + " index");
        }
    }
}
