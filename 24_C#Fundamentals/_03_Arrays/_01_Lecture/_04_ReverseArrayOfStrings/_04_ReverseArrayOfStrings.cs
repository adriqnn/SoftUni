using System;

public class _04_ReverseArrayOfStrings
{
    public static void Main(string[] args)
    {
        // Read input values
        string[] arr = Console.ReadLine().Split(new char[] { ' ' }, StringSplitOptions.RemoveEmptyEntries);

        // Reverse the array
        for (int i = 0; i < arr.Length / 2; i++)
        {
            string first = arr[i];
            string last = arr[arr.Length - i - 1];
            arr[i] = last;
            arr[arr.Length - 1 - i] = first;
        }

        // Print result
        foreach (string e in arr)
        {
            Console.Write(e + " ");
        }
    }
}
