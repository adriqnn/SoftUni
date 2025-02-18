using System;

public class _04_ArrayRotation
{
    public static void Main(string[] args)
    {
        // Read input values
        int[] numbers = Console.ReadLine().Split().Select(int.Parse).ToArray();
        int n = int.Parse(Console.ReadLine());

        for (int i = 0; i < n; i++)
        {
            int numberInTheFront = numbers[0];
            int[] changingArray = new int[numbers.Length];

            for (int j = 0; j < numbers.Length - 1; j++)
            {
                changingArray[j] = numbers[j + 1];
            }

            changingArray[changingArray.Length - 1] = numberInTheFront;
            numbers = changingArray;
        }

        // Print result
        Console.WriteLine(string.Join(" ", numbers));
    }
}
